package dsg.swing.windows;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;

public class StudentViewPanel extends JPanel{
	private static final long serialVersionUID = 0L;
	
	final int CONTROL_WIDTH = 26;
	final int CONTROL_HEIGHT = 26;
	final Dimension CONTROL_DIMENSION = new Dimension(CONTROL_WIDTH, CONTROL_HEIGHT);
	public JTable TABLE;

	public StudentViewPanel(Dimension initial) {
		super();
		this.setPreferredSize(new Dimension(initial));
		this.setBorder(new CompoundBorder(
				BorderFactory.createEmptyBorder(0, 4, 4, 1),
				BorderFactory.createTitledBorder("Students")
			)
		);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		TABLE = new JTable(10, 1);
		TABLE.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - CONTROL_HEIGHT));
		this.add(TABLE);
		
		this.add(Box.createVerticalStrut(4));
		
		Box editBox = new Box(BoxLayout.X_AXIS);
		editBox.setPreferredSize(new Dimension(this.getWidth(), CONTROL_HEIGHT));
		editBox.add(Box.createHorizontalGlue());
		JButton ADD = new JButton("+");
		ADD.setPreferredSize(CONTROL_DIMENSION);
		JButton REMOVE = new JButton("-");
		REMOVE.setPreferredSize(CONTROL_DIMENSION);
		editBox.add(ADD);
		editBox.add(REMOVE);
		
		this.add(editBox);
	};
}
