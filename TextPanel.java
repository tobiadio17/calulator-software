import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class TextPanel extends JPanel implements KeyListener, DocumentListener {
	
		private static JTextField textField;
		private static int currentNumber = 0;
		private Font font = new Font("Segoe UI", Font.BOLD, 30);

		
		public TextPanel() {
			textField = new JTextField(12);
			textField.setHorizontalAlignment(JTextField.RIGHT);
			textField.setFont(font);
			textField.setBounds(6, 55, 359, 65);
			add(textField);
			textField.addKeyListener(this);
			textField.getDocument().addDocumentListener(this);
		}

		//gets the input from the textfield
		public static JTextField getTextField() {
			return textField;
		}
		//get the input 
		public static int getCurrentNumber() {
			return currentNumber;
		}

		
		public void insertUpdate(DocumentEvent e) {
			String input = getTextField().getText();
			//while textfield isnt empty
			if (!input.isEmpty()) {
				//set the value for conversion
				currentNumber = ButtonPanel.convertNumber(input);
				String currentBinNumber = Integer.toBinaryString(currentNumber);
				while (currentBinNumber.length() < 64)
					currentBinNumber = "0" + currentBinNumber;
				int count = 0;
				//converts binary number
				for (int x = 0, y = 1, z = 2, w = 3; x < 64 && y < 65 && z < 66 && w < 67; x += 4, y += 4, z += 4, w += 4) 
				{
					String bitX = Character.toString(currentBinNumber.charAt(x));
					String bitY = Character.toString(currentBinNumber.charAt(y));
					String bitZ = Character.toString(currentBinNumber.charAt(z));
					String bitW = Character.toString(currentBinNumber.charAt(w));
					String halfByte = bitX + bitY + bitZ + bitW;
					count++;
				}
			}
		}

		public void removeUpdate(DocumentEvent e) {
			String input = getTextField().getText();
			//while textfield isnt empty
			if (!input.isEmpty()) {
				//set the value for conversion
				currentNumber = ButtonPanel.convertNumber(input);
				String currentNumberInBin = Integer.toBinaryString(currentNumber);
				while (currentNumberInBin.length() < 64)
					currentNumberInBin = "0" + currentNumberInBin;
				int count = 0;
				//convert
				for (int x = 0, y = 1, z = 2, w = 3; x < 64; x += 4, y += 4, z += 4, w += 4) 
				{
					String bitX = Character.toString(currentNumberInBin.charAt(x));
					String bitY = Character.toString(currentNumberInBin.charAt(y));
					String bitZ = Character.toString(currentNumberInBin.charAt(z));
					String bitW = Character.toString(currentNumberInBin.charAt(w));
					String halfByte = bitX + bitY + bitZ + bitW;
					count++;
				}
			}
		}

		public void changedUpdate(DocumentEvent e) {
		}

		
		//enters number when typed
		public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			if (NumPanel.getHex().isSelected() && ((c < '0') || (c > '9')) && ((c < 'A') || (c > 'F'))
					&& (c != KeyEvent.VK_BACK_SPACE)) {
				e.consume();
			} else if (NumPanel.getDec().isSelected() && ((c < '0') || (c > '9'))
					&& (c != KeyEvent.VK_BACK_SPACE)) {
				e.consume();
			} else if (NumPanel.getOct().isSelected() && ((c < '0') || (c > '7'))
					&& (c != KeyEvent.VK_BACK_SPACE)) {
				e.consume();
			} else if (NumPanel.getBin().isSelected() && ((c < '0') || (c > '1'))
					&& (c != KeyEvent.VK_BACK_SPACE)) {
				e.consume();
			}
		}
		
	
		public void keyPressed(KeyEvent e) {
		}

		public void keyReleased(KeyEvent e) {
		}
		
}
