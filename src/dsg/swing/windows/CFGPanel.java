package dsg.swing.windows;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CFGPanel extends JPanel {
	private static final long serialVersionUID = 0L;
	
	public CFGPanel(Dimension initial) {
		super();
		this.setPreferredSize(new Dimension(initial));
		this.setBackground(new Color(0xFBC3B0));
		this.setBorder(BorderFactory.createEmptyBorder());
	}
}
