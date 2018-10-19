package paint_raster;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PWidth extends JPanel
{
	public PWidth ( PCommand cmd )
	{
		setLayout(null);
		setBackground(Color.YELLOW);

		JButton btnLine5 = new JButton("Line Thickness - 5");
		JButton btnLine10 = new JButton("Line Thickness - 10");
		JButton btnLine15 = new JButton("Line Thickness - 15");

		btnLine5.setBounds( 10, 20, 180, 40 );
		btnLine10.setBounds( 10, 80, 180, 40 );
		btnLine15.setBounds( 10, 140, 180, 40 );

		add(btnLine5);
		add(btnLine10);
		add(btnLine15);

		btnLine5.addActionListener(cmd.aLine);
		btnLine10.addActionListener(cmd.aLine);
		btnLine15.addActionListener(cmd.aLine);
	}
}
