
package view;

import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;

public class LimitDocument extends PlainDocument {
    private final int maxLength;

    public LimitDocument(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        if (str == null || (getLength() + str.length() > maxLength)) {
            return;
        }
        super.insertString(offset, str, attr);
    }
}