package win;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Window {

		public void msg(String msg) {
			JOptionPane.showMessageDialog(null, msg);
		}
		
		public String in(String msg) {
			return JOptionPane.showInputDialog(msg);
		}
		
		public int option(String[] options, String msg) {
			return JOptionPane.showOptionDialog(
					null, 
					msg, // my message
	                "Click a button", // dialog box title
	                JOptionPane.DEFAULT_OPTION, 
	                JOptionPane.INFORMATION_MESSAGE, 
	                null, 
	                options, // possible options
	                options[0]); // default option
		}
		
		public void println(String msg) {
			System.out.println(msg);
		}
		
		public void print(String msg) {
			System.out.println(msg);
		}
		
		public void msg(Object msg) {
			JOptionPane.showMessageDialog(null, msg);
		}
		
		public String in(Object msg) {
			return JOptionPane.showInputDialog(msg);
		}
		
		public int option(Object[] options, Object msg) {
			return JOptionPane.showOptionDialog(
					null, 
					msg, // my message
	                "Click a button", // dialog box title
	                JOptionPane.DEFAULT_OPTION, 
	                JOptionPane.INFORMATION_MESSAGE, 
	                null, 
	                options, // possible options
	                options[0]); // default option
		}
		public void img(ImageIcon i) {
			JOptionPane.showMessageDialog(null,null,null,JOptionPane.PLAIN_MESSAGE,i);
		}
}
