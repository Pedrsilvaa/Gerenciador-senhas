
package controller;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Account;

public class Controller {
    private static final String FILE_NAME = "accounts.ser";
    
    public void Create(String name, String password) {
        Account account = new Account(name, password);
        ArrayList<Account> accounts = Read();
        
        accounts.add(account);
        
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accounts);
            JOptionPane.showMessageDialog(null, "Conta guardada com sucesso", "Criando conta", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao guardar conta", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public ArrayList<Account> Read() {
        ArrayList<Account> deserializedAccounts = new ArrayList<>();
        
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            deserializedAccounts = (ArrayList<Account>) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return deserializedAccounts;
    }
    
    public String GeneratePassword(boolean letter, boolean digit, boolean symbol, int amount) {
        Random Random = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",
                digits = "0123456789",
                symbols = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/\\",
                characters = "", password = "";
        
        if(letter && !digit && !symbol) characters = letters;
        else if(!letter && digit && !symbol) characters = digits;
        else if(!letter && !digit && symbol) characters = symbols;
        else if(letter && digit && !symbol) characters = letters + digits;
        else if(letter && !digit && symbol) characters = letters + symbols;
        else if(!letter && digit && symbol) characters = digits + symbols;
        else characters = letters + digits + symbols;
        
        for(int i = 0; i < amount; i++) { 
            password += characters.charAt(Random.nextInt(characters.length()));
        }
        
        return password;
    }
    
    public boolean VerifyText(String name, String password) {
        ArrayList<Account> accounts = Read();
        
        if(name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (Account acc : accounts) {
            if (acc.getName().equals(name)) {
                JOptionPane.showMessageDialog(null, "Este nome já está em uso, escreva outro nome", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public boolean VerifyText(String password) {
        if(password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de senha corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public String[] GetData(String name) {
        ArrayList<Account> accounts = Read();
        String password = "";
        
        for(Account acc : accounts) {
            if(acc.getName().equals(name)) {
                password = acc.getPassword();
                break;
            }
        }
        
        String[] data = {name, password};
        return data;
    }
    
    public void Update(String name, String newPassword) {
        Account account = new Account(name, newPassword);
        ArrayList<Account> accounts = Read();
        int i = 0;
        
        for(Account acc : accounts) {
            if(acc.getName().equals(name)) {
                break;
            }
            i++;
        }
        
        accounts.set(i, account);
        
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accounts);
            JOptionPane.showMessageDialog(null, "Conta atualizada com sucesso", "Atualização", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar conta", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void Delete(String name) {
        ArrayList<Account> accounts = Read();
        int i = 0;
        
        for(Account acc : accounts) {
            if(acc.getName().equals(name)) {
                break;
            }
            i++;
        }
        
        accounts.remove(i);
        
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accounts);
            JOptionPane.showMessageDialog(null, "Conta deletada com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar conta", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void Copy(String name) {
        String[] data = GetData(name);
        String password = data[1];
        
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(password);
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "Senha da conta copiada", "Copiar senha", JOptionPane.INFORMATION_MESSAGE);
    }
}
