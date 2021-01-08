import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ButtonPanel extends JPanel implements ActionListener {
		private static String buttonIcons[] = { "\u2191", "Mod", "CE", "C", "\u232B", "\u00F7", 
				"A", "B", "7", "8", "9", "\u00D7", 
				"C", "D", "4", "5", "6", "\u2212", 
				"E", "F", "1", "2", "3", "+",
				"(", ")", "\u00B1", "0", ".", "=" };
		private static JButton buttons[] = new JButton[buttonIcons.length];
		private int count = 0; 
		private int firstNum = 0;
		private int secondNum = 0;
		private int result = 0;
		private String output = "";
		private String operation = "";
		private Font font = new Font("", Font.PLAIN, 12);
		
		public ButtonPanel() {
			
			for (int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton(buttonIcons[i]);
				buttons[i].setFont(new Font("", Font.PLAIN, 12));
				if (buttonIcons[i].matches("[A-F]")) 
					buttons[i].setEnabled(false);
			}
            //set button layout
			setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.anchor = GridBagConstraints.PAGE_START;
			c.fill = GridBagConstraints.BOTH;
			c.weightx = .20;
			c.weighty = .20;
			c.insets = new Insets(1, 1, 1, 2);

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 6; j++) {
					c.gridx = j;
					c.gridy = i;
					add(buttons[count++], c);
				}
			}

			for (int i = 0; i < buttons.length; i++) {
				buttons[i].addActionListener(this);
			}
		}

		//method to get buttons
		public static JButton getButton(int i) {
			return buttons[i];
		}
		
		//converts numbers from strings to ints
		public static int convertNumber(String number) {
			if (NumPanel.getHex().isSelected()) {
				return Integer.valueOf(number, 16).intValue();
			} else if ((NumPanel.getDec().isSelected())) {
				return Integer.valueOf(number, 10).intValue();
			} else if ((NumPanel.getOct().isSelected())) {
				return Integer.valueOf(number, 8).intValue();
			} else if ((NumPanel.getBin().isSelected())) {
				return Integer.valueOf(number, 2).intValue();
			}
			return 0;
		}
		//converts numbers from ints to strings
		public static String convertNumberString(int number) {
			if (NumPanel.getHex().isSelected()) {
				return Integer.toHexString(number);
			} else if (NumPanel.getDec().isSelected()) {
				return Integer.toString(number);
			} else if (NumPanel.getOct().isSelected()) {
				return Integer.toOctalString(number);
			} else if (NumPanel.getBin().isSelected()) {
				return Integer.toBinaryString(number);
			}
			return "";
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[2]) {
				String input = TextPanel.getTextField().getText();
				if (input != null && input.length() > 0) {
					TextPanel.getTextField().setText("");
				}
			}
			if (e.getSource() == buttons[4]) {
				String input = TextPanel.getTextField().getText();
				if (input != null && input.length() > 0) {
					TextPanel.getTextField().setText(input.substring(0, input.length() - 1));
				}
			}
			//division operation
			if (e.getSource() == buttons[5]) {
				String input = TextPanel.getTextField().getText();
				firstNum = convertNumber(input);
				TextPanel.getTextField().setText("");
				operation = "/";
			}

			
			if (e.getSource() == buttons[6]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "A");
			}
			if (e.getSource() == buttons[7]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "B");
			}
			if (e.getSource() == buttons[8]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "7");
			}
			if (e.getSource() == buttons[9]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "8");
			}
			if (e.getSource() == buttons[10]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "9");
			}
			//multiplication operation
			if (e.getSource() == buttons[11]) {
				String input = TextPanel.getTextField().getText();
				firstNum = convertNumber(input);
				TextPanel.getTextField().setText("");
				operation = "*";
			}
			
			if (e.getSource() == buttons[12]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "C");
			}
			if (e.getSource() == buttons[13]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "D");
			}
			if (e.getSource() == buttons[14]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "4");
			}
			if (e.getSource() == buttons[15]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "5");
			}
			if (e.getSource() == buttons[16]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "6");
			}
			if (e.getSource() == buttons[17]) {
				String input = TextPanel.getTextField().getText();
				firstNum = convertNumber(input);
				TextPanel.getTextField().setText("");
				operation = "-";
			}
			
			if (e.getSource() == buttons[18]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "E");
			}
			if (e.getSource() == buttons[19]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "F");
			}
			if (e.getSource() == buttons[20]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "1");
			}
			if (e.getSource() == buttons[21]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "2");
			}
			if (e.getSource() == buttons[22]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "3");
			}
			if (e.getSource() == buttons[23]) {
				String input = TextPanel.getTextField().getText();
				firstNum = convertNumber(input);
				TextPanel.getTextField().setText("");
				operation = "+";
			}
			
			if (e.getSource() == buttons[24]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "(");
			}
			if (e.getSource() == buttons[25]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + ")");
			}
			if (e.getSource() == buttons[27]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + "0");
			}
			
			if (e.getSource() == buttons[28]) {
				String input = TextPanel.getTextField().getText();
				TextPanel.getTextField().setText(input + ".");
			}
			
			if (e.getSource() == buttons[29]) {
				if (operation == "mod") {
					String input = TextPanel.getTextField().getText();
					secondNum = convertNumber(input);
					result = firstNum % secondNum;
					output = convertNumberString(result);
					TextPanel.getTextField().setText(output);
				}
				else if (operation == "/") {
					String input = TextPanel.getTextField().getText();
					secondNum = convertNumber(input);
					if(secondNum == 0) {
						result = 0;
						output = "Infinity";
					}
					else {
						result = firstNum / secondNum;
						output = convertNumberString(result);
					}
					TextPanel.getTextField().setText(output);
				} 
				else if (operation == "*") {
					String input = TextPanel.getTextField().getText();
					secondNum = convertNumber(input);
					result = firstNum * secondNum;
					output = convertNumberString(result);
					TextPanel.getTextField().setText(output);
				} 
				else if (operation == "-") {
					String input = TextPanel.getTextField().getText();
					secondNum = convertNumber(input);
					result = firstNum - secondNum;
					output = convertNumberString(result);
					TextPanel.getTextField().setText(output);
				} 
				else if (operation == "+") {
					String input = TextPanel.getTextField().getText();
					secondNum = convertNumber(input);
					result = firstNum + secondNum;
					output = convertNumberString(result);
				TextPanel.getTextField().setText(output);
			}
		}
	}
}
