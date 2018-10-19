package paint_raster;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PType extends JPanel
{

	public PType ( PCommand cmd )
	{
		setLayout(null);
		setBackground(Color.red);

		JButton btnCur = new JButton("Curves");
		JButton btnRec = new JButton("Rectangle");
		JButton btnCir = new JButton("Сircle");
		JButton btnEli = new JButton("Ellipse");
		JButton btnLin = new JButton("Line");

		btnCur.setBounds( 10, 20, 180, 20 );
		btnRec.setBounds( 10, 55, 180, 20 );
		btnCir.setBounds( 10, 90, 180, 20 );
		btnEli.setBounds( 10, 125, 180, 20 );
		btnLin.setBounds( 10, 160, 180, 20 );

		add(btnCur);
		add(btnRec);
		add(btnCir);
		add(btnEli);
		add(btnLin);

		btnCur.addActionListener(cmd.aType);
		btnRec.addActionListener(cmd.aType);
		btnCir.addActionListener(cmd.aType);
		btnEli.addActionListener(cmd.aType);
		btnLin.addActionListener(cmd.aType);
	}

}
