package paint_raster;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class PColor extends JPanel
{
	public PColor ( PCommand cmd )
	{
		setLayout(null);
		setBackground(Color.GREEN);

		JButton btnColor = new JButton("Color");
		JButton btnRed = new JButton("Red");
		JButton btnYellow = new JButton("Yellow");
		JButton btnGreen = new JButton("Green");
		JButton btnBlack = new JButton("Black");
		JButton btnCyan = new JButton("Cyan");

		btnColor.setBounds(5, 5, 10, 10);
		btnRed.setBounds( 10, 20, 180, 20 );
		btnYellow.setBounds( 10, 55, 180, 20 );
		btnGreen.setBounds( 10, 90, 180, 20 );
		btnBlack.setBounds(10, 125, 180, 20);
		btnCyan.setBounds(10, 160, 180, 20);

		add ( btnColor );
		add(btnRed);
		add(btnYellow);
		add(btnGreen);
		add(btnBlack);
		add(btnCyan);

		btnColor.addActionListener(cmd.aColor);
		btnRed.addActionListener(cmd.aColor);
		btnYellow.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlack.addActionListener(cmd.aColor);
		btnCyan.addActionListener(cmd.aColor);
		
	}
}
