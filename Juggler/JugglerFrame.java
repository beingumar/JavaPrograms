import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JugglerFrame extends Frame{

	private TextField ftf;
	private TextField stf;
	private TextField ttf;
	
	
	public JugglerFrame() {
		
		setVisible(true);
		setLayout(null);
		setTitle("Juggler");
		setBounds(100, 100, 500, 400);

//		Label l1 = new Label("First box:");
//		add(l1);
//		l1.setBounds(100, 100, 50, 40);
//		
		 ftf = new TextField();
		add(ftf);
		ftf.setBounds(100,100,100,25);
		
		 stf = new TextField();
		add(stf);
		stf.setBounds(300,100,100,25);
		
		 ttf = new TextField();
		add(ttf);
		ttf.setBounds(200,140,100,25);
		
		Button cw = new Button("ClockWise");
		add(cw);
		cw.setBounds(100, 200, 140, 40);
		cw.addActionListener(new JugglerHandler(this));
		
		Button acw = new Button("AntiClockWise");
		add(acw);
		acw.setBounds(300, 200, 140, 40);
		acw.addActionListener(new JugglerHandler(this));
		
		//Closing the window
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JugglerFrame ajf= (JugglerFrame)e.getSource();
				ajf.dispose();			
				}
		
		});
		
		
	}
	public TextField getFtf() {
		return ftf;
	}

	public void setFtf(TextField ftf) {
		this.ftf = ftf;
	}

	public TextField getStf() {
		return stf;
	}

	public void setStf(TextField stf) {
		this.stf = stf;
	}

	public TextField getTtf() {
		return ttf;
	}

	public void setTtf(TextField ttf) {
		this.ttf = ttf;
	}


	
}
