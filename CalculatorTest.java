

import javax.swing.JFrame;

public class CalculatorTest {

	public static void main(String[] args) {
	  CalcFrame newCalc = new CalcFrame();
	  newCalc.setTitle("Calculator");
	  newCalc.setBounds(100, 100, 390, 625);
	  newCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  newCalc.setVisible(true);			
	}

}
