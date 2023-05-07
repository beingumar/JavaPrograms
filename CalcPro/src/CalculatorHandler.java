
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorHandler implements ActionListener{


	CalculatorFrame cf ;
	public CalculatorHandler(CalculatorFrame calculatorFrame) {
		this.cf = calculatorFrame;
	}

	public void actionPerformed(ActionEvent e) {

		
		int a = Integer.parseInt(cf.getOperend1Txt().getText());
		int b = Integer.parseInt(cf.getOperend2Txt().getText());
		int result;
		if(e.getActionCommand().equalsIgnoreCase("Add")) {
			
			result = a+b;
			cf.getAnswerLbl().setText("Answer = "+ result);
			
		}else if(e.getActionCommand().equalsIgnoreCase("Subtract")) {
			
			result = a-b;
			cf.getAnswerLbl().setText("Answer = "+ result);
		}else if(e.getActionCommand().equalsIgnoreCase("Multiply")) {
			
			result = a*b;
			cf.getAnswerLbl().setText("Answer = "+ result);
		}else if(e.getActionCommand().equalsIgnoreCase("Division")) {
			
			if(a==0 || b==0) {
				cf.getAnswerLbl().setText("Not divisible by Zero");
			}else {
				result = a/b;
				cf.getAnswerLbl().setText("Answer = "+ result);	
			}
			
		}
		
	}

}