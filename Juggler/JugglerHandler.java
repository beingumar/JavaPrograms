import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugglerHandler implements ActionListener {
	JugglerFrame jf;
	private String textField1;
    private String textField2;
    private String textField3;

	public JugglerHandler(JugglerFrame jugglerFrame) {
		this.jf=jugglerFrame;
	}
	  	
	    
	public void actionPerformed(ActionEvent e) {

		textField1 = jf.getFtf().getText();
		textField2 = jf.getStf().getText();
		textField3 = jf.getTtf().getText();
		if(e.getActionCommand().equalsIgnoreCase("ClockWise")) {
       
	          jf.getFtf().setText(textField3);
	          jf.getStf().setText(textField1);
	          jf.getTtf().setText(textField2);
	    
		}else {
			 jf.getFtf().setText(textField2);
	          jf.getStf().setText(textField3);
	          jf.getTtf().setText(textField1);
		}
		
		
	}
	
}
