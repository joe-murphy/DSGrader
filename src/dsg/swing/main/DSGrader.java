package dsg.swing.main;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

import dsg.swing.windows.CFGPanel;
import dsg.swing.windows.StudentViewPanel;

public class DSGrader {
	final int WINDOW_HEIGHT = 400;
	final int WINDOW_WIDTH = 500;
	final double LEFT_PROPORTION = 0.327;
	
	public static void main(String[] sa) {
		EventQueue.invokeLater(DSGrader::new);
	}
	
	public DSGrader() {
		JFrame jf = new JFrame("DSGrader");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		file.add(new JMenuItem("Import..."));
		file.add(new JSeparator());
		file.add(new JMenuItem("Exit"));
		mb.add(file);
		jf.setJMenuBar(mb);
		
		JSplitPane jp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		jp.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		jp.setDividerSize(3);
		jp.setBorder(BorderFactory.createEmptyBorder());
		jp.setResizeWeight(0);
		jf.add(jp);
		
		jp.setLeftComponent(new StudentViewPanel(new Dimension((int) (WINDOW_WIDTH * LEFT_PROPORTION), WINDOW_HEIGHT)));
		jp.setRightComponent(new CFGPanel(new Dimension((int) (WINDOW_WIDTH * (1 - LEFT_PROPORTION)), WINDOW_HEIGHT)));
		
		jf.pack();
		jp.setDividerLocation(LEFT_PROPORTION);
		jf.setVisible(true);
	}
}
