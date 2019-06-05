import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class even extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pass;
	
	public even() {
		super("This is The Title!");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here...");
		add(item2);
		
		item3 = new JTextField("Uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		pass = new JPasswordField("Password");
		add(pass);
		
		thehandler ob = new thehandler();
		item1.addActionListener(ob);
		item2.addActionListener(ob);
		item3.addActionListener(ob);
		pass.addActionListener(ob);
		
		
	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String txt = "";
			if(e.getSource()==item1)
				txt=String.format("Field 1: %s", e.getActionCommand());
			else if(e.getSource()==item2)
				txt=String.format("Field 2: %s", e.getActionCommand());
			else if(e.getSource()==item3)
				txt=String.format("Field 3: %s", e.getActionCommand());
			else if(e.getSource()==pass)
				txt=String.format("Password Field is: %s", e.getActionCommand());
			
			JOptionPane.showMessageDialog(null, txt);
			
			}
		}
}