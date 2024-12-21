
package model;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String Name, Password;
    
    public Account(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @Override
    public String toString() {
        return "\n{" +
                "\n    Name = '" + Name + "'," +
                "\n    Password = '" + Password + "'" +
                "\n}";
    }
}
