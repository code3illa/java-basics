import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class jframe extends JFrame{
	
	private JLabel item1;
	
	public jframe() {
		super("The Title Bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		
		item1.setToolTipText("Hovering over!");
		
		add(item1);
	}

}
