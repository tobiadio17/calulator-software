import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class CalcFrame extends JFrame implements ActionListener {
	private JButton midButton;
	public CalcFrame () {
		//frame layout
		setLayout(null);

		//where to enter numbers
		TextPanel inputPanel = new TextPanel();
		//sets font, background color and foreground color
		inputPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));			
		inputPanel.setBackground(new Color(238,238,238));
		inputPanel.setForeground(Color.BLACK);
		inputPanel.setBounds(6, 55, 359, 65);
		//adds inputPanel to frame
		add(inputPanel);
		
		//button next to header
		JLabel icon = new JLabel("   \u2630");
		//sets font and size
		icon.setFont(new Font("Baskerville", Font.PLAIN, 20));
		icon.setBounds(2, 6, 61, 37);
		//adds icon to frame
		add(icon);
		
		//header on the top of the frame
		JLabel header = new JLabel("PROGRAMMER");
		header.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		header.setBounds(64, 14, 263, 40);
		add(header);
		
		//panel that contains the hex, bin, dec and oct buttons
		NumPanel sidePanel = new NumPanel();
		sidePanel.setBounds(6, 153, 63, 140);
		sidePanel.setBorder(new EmptyBorder(0,0,0,0));
		add(sidePanel);
	
		//adds buttons to the calculator frame
		ButtonPanel buttons = new ButtonPanel();
		//sets bounds 
		buttons.setBounds(6, 336, 359, 231);
		add(buttons);	
		//buttons implemented for touch and feel
	    JButton and = new JButton(" And");
		and.setBounds(306, 290, 57, 46);
		add(and);
		
		JButton not = new JButton(" Not");
		not.setBounds(246, 290, 57, 46);
		add(not);
		
		JButton xor = new JButton(" Xor");
		xor.setBounds(186, 290, 57, 46);
		add(xor);
		
		JButton or = new JButton(" Or");
		or.setBounds(126, 290, 57, 46);
		add(or);
		
		JButton rsh = new JButton(" Rsh");
		rsh.setBounds(67, 290, 57, 46);
		add(rsh);
		
		JButton lsh = new JButton(" Lsh");
		lsh.setBounds(7,290, 57, 46);
		add(lsh);
		
		//QWORD button
		midButton = new JButton("QWORD");
		midButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		midButton.setBounds(142, 245, 100, 40);
		add(midButton);
		midButton.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==midButton)
        {
			if(midButton.getText().equals("QWORD")) 
				midButton.setText("DWORD");
			else if(midButton.getText().equals("DWORD"))
			    midButton.setText("WORD");
			else if(midButton.getText().equals("WORD"))
			    midButton.setText("BYTE");
			else if(midButton.getText().equals("BYTE"))
			    midButton.setText("QWORD");
        }
     }   
	}	


