package dsg.swing.windows;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class TestListPanel extends JPanel {
	private static final long serialVersionUID = 0L;

	public TestListPanel(Dimension initial) {
		super();
		this.setPreferredSize(initial);
		this.setBackground(new Color(0xD8FCA8));
		this.setBorder(BorderFactory.createEmptyBorder());
	};
}
