package dsg.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DSGrader {
	final int WINDOW_HEIGHT = 400;
	final int WINDOW_WIDTH = 500;
	
	public static void main(String[] sa) {
		EventQueue.invokeLater(DSGrader::new);
	}
	
	public DSGrader() {
		JFrame jf = new JFrame("DSGrader");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(jf.getWidth(), jf.getHeight()));
		jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
		jf.add(jp);
		
		Box studentBox = new Box(BoxLayout.Y_AXIS);
		JPanel studentPane = new JPanel();
		studentPane.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, WINDOW_HEIGHT));
		studentPane.setBorder(BorderFactory.createEtchedBorder());
		studentBox.add(studentPane);
		jp.add(studentBox);
		
		Box cfgBox = new Box(BoxLayout.Y_AXIS);
		JPanel cfgPane = new JPanel();
		cfgPane.setPreferredSize(new Dimension(WINDOW_WIDTH / 2, WINDOW_HEIGHT));
		cfgPane.setBorder(BorderFactory.createEtchedBorder());
		cfgBox.add(cfgPane);
		jp.add(cfgBox);
		
		
		jf.pack();
		jf.setVisible(true);
	}
}
