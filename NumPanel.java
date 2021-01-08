import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NumPanel extends JPanel implements ActionListener {
	private static JRadioButton hex;
	private static JRadioButton dec;
	private static JRadioButton oct;
	private static JRadioButton bin;

	
	public NumPanel() {
		//sets layout and borders
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createTitledBorder(""));
		
		hex = new JRadioButton("Hex");
		dec = new JRadioButton("Dec");
		oct = new JRadioButton("Oct");
		bin = new JRadioButton("Bin");
		
		ButtonGroup baseGroup = new ButtonGroup();
	
		//Adds buttons to base group
		baseGroup.add(hex);
		baseGroup.add(dec);
		baseGroup.add(oct);
		baseGroup.add(bin);
		dec.setSelected(true);
		
		//Adds to panel
		add(hex);
		add(dec);
		add(oct);
		add(bin);
		
		
		hex.addActionListener(this);
		dec.addActionListener(this);
		oct.addActionListener(this);
		bin.addActionListener(this);
	}
	
	//gets methods to return buttons
	public static JRadioButton getHex() 
	{ return hex; }
	public static JRadioButton getDec()
	{ return dec; }
	public static JRadioButton getOct()
	{ return oct; }
	public static JRadioButton getBin()
	{ return bin; }
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == hex) {
			
			int number = TextPanel.getCurrentNumber();			
			if(number != 0) {
				//converts number 
				TextPanel.getTextField().setText(ButtonPanel.convertNumberString(number));
			}

			//sets ABCDEF to true
			ButtonPanel.getButton(6).setEnabled(true);
			ButtonPanel.getButton(7).setEnabled(true);
			ButtonPanel.getButton(12).setEnabled(true);
			ButtonPanel.getButton(13).setEnabled(true);
			ButtonPanel.getButton(18).setEnabled(true);
			ButtonPanel.getButton(19).setEnabled(true);
			
			//sets numbers to true
			ButtonPanel.getButton(8).setEnabled(true);
			ButtonPanel.getButton(9).setEnabled(true);
			ButtonPanel.getButton(10).setEnabled(true);
			
			ButtonPanel.getButton(14).setEnabled(true);
			ButtonPanel.getButton(15).setEnabled(true);
			ButtonPanel.getButton(16).setEnabled(true);
			
			ButtonPanel.getButton(20).setEnabled(true);
			ButtonPanel.getButton(21).setEnabled(true);
			ButtonPanel.getButton(22).setEnabled(true);
			ButtonPanel.getButton(27).setEnabled(true);
			
		}
		if(e.getSource() == dec) {
			
			int number = TextPanel.getCurrentNumber();
			
			if(number != 0) {
				//converts number
				TextPanel.getTextField().setText(ButtonPanel.convertNumberString(number));
			}
				//sets ABCDEF to false
				ButtonPanel.getButton(6).setEnabled(false);
				ButtonPanel.getButton(7).setEnabled(false);
				ButtonPanel.getButton(12).setEnabled(false);
				ButtonPanel.getButton(13).setEnabled(false);
				ButtonPanel.getButton(18).setEnabled(false);
				ButtonPanel.getButton(19).setEnabled(false);
			
			//sets numbers to true
				ButtonPanel.getButton(8).setEnabled(true);
				ButtonPanel.getButton(9).setEnabled(true);
				ButtonPanel.getButton(10).setEnabled(true);
				
				ButtonPanel.getButton(14).setEnabled(true);
				ButtonPanel.getButton(15).setEnabled(true);
				ButtonPanel.getButton(16).setEnabled(true);
				
				ButtonPanel.getButton(20).setEnabled(true);
				ButtonPanel.getButton(21).setEnabled(true);
				ButtonPanel.getButton(22).setEnabled(true);
				ButtonPanel.getButton(27).setEnabled(true);
			
		}
		if(e.getSource() == oct) {
		
			int number = TextPanel.getCurrentNumber();
			
			if(number != 0) {
				//converts number 
				TextPanel.getTextField().setText(ButtonPanel.convertNumberString(number));
			}
				//sets ABCDEF to false
				ButtonPanel.getButton(6).setEnabled(false);
				ButtonPanel.getButton(7).setEnabled(false);
				ButtonPanel.getButton(12).setEnabled(false);
				ButtonPanel.getButton(13).setEnabled(false);
				ButtonPanel.getButton(18).setEnabled(false);
				ButtonPanel.getButton(19).setEnabled(false);
				
			//sets numbers 8 and 9 to false
			ButtonPanel.getButton(9).setEnabled(false);
			ButtonPanel.getButton(10).setEnabled(false);
			//set other numbers to true
			ButtonPanel.getButton(8).setEnabled(true);
			
			ButtonPanel.getButton(14).setEnabled(true);
			ButtonPanel.getButton(15).setEnabled(true);
			ButtonPanel.getButton(16).setEnabled(true);
			
			ButtonPanel.getButton(20).setEnabled(true);
			ButtonPanel.getButton(21).setEnabled(true);
			ButtonPanel.getButton(22).setEnabled(true);
			ButtonPanel.getButton(27).setEnabled(true);
		
		}
		if(e.getSource() == bin) {
			int number = TextPanel.getCurrentNumber();
			
			if(number != 0) {
				//converts number 
				TextPanel.getTextField().setText(ButtonPanel.convertNumberString(number));
			}
			
			//sets ABCDEF to false
			ButtonPanel.getButton(6).setEnabled(false);
			ButtonPanel.getButton(7).setEnabled(false);
			ButtonPanel.getButton(12).setEnabled(false);
			ButtonPanel.getButton(13).setEnabled(false);
			ButtonPanel.getButton(18).setEnabled(false);
			ButtonPanel.getButton(19).setEnabled(false);
			
			//sets numbers to false
			ButtonPanel.getButton(8).setEnabled(false);
			ButtonPanel.getButton(9).setEnabled(false);
			ButtonPanel.getButton(10).setEnabled(false);
			
			ButtonPanel.getButton(14).setEnabled(false);
			ButtonPanel.getButton(15).setEnabled(false);
			ButtonPanel.getButton(16).setEnabled(false);
			
			ButtonPanel.getButton(21).setEnabled(false);
			ButtonPanel.getButton(22).setEnabled(false);
			
		}
	}

}
