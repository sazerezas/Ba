import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

/** Copyright: Ba
**/
public class Main {
	static boolean running = false;
	public static void main(String ... args) {
		running = true;
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {new Main().createGui();}
		});
	}
	public transient float resolution = 1.45f;
	public transient int height = 600;
	void createGui() {
		JFrame fr = new JFrame("BA");
		fr.setSize(new Dimension((int) (height*resolution), height));
		fr.setDefaultCloseOperation(3);
		fr.setLocationRelativeTo(new JFrame());
		{
			JMenuBar mb = new JMenuBar();
			mb.add(new JMenu("BA") {});
			mb.add(new JMenu("Datei") {});
			mb.add(new JMenu("Help") {});
			fr.setJMenuBar(mb);
		}
		fr.setVisible(running);
		System.out.println("Works :D");//nochmal
		
}
	
}
