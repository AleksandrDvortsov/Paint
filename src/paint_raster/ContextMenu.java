package paint_raster;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class ContextMenu extends JPopupMenu
{
	public ContextMenu( PCommand cmd )
	{
		JMenu mType = new JMenu("All type");
		JMenu mWight = new JMenu("All wight");
		JMenu mColor = new JMenu("All color");
		add( mType );
		add( mWight );
		add( mColor );
		
		JMenuItem btnColor = new JMenuItem("Color");
		JMenuItem btnRed = new JMenuItem("Red");
		JMenuItem btnYellow = new JMenuItem("Yellow");
		JMenuItem btnGreen = new JMenuItem("Green");
		JMenuItem btnBlack = new JMenuItem("Black");
		JMenuItem btnCyan = new JMenuItem("Cyan");

		JMenuItem btnCur = new JMenuItem("Curves");
		JMenuItem btnRec = new JMenuItem("Rectangle");
		JMenuItem btnCir = new JMenuItem("Сircle");
		JMenuItem btnEli = new JMenuItem("Ellipse");
		JMenuItem btnLin = new JMenuItem("Line");

		JMenuItem btnLine5 = new JMenuItem("Line Thickness - 5");
		JMenuItem btnLine10 = new JMenuItem("Line Thickness - 10");
		JMenuItem btnLine15 = new JMenuItem("Line Thickness - 15");

		mColor.add (btnColor);
		mColor.add (btnRed);
		mColor.add (btnYellow);
		mColor.add (btnGreen);
		mColor.add (btnBlack);
		mColor.add (btnCyan);

		mType.add(btnCur);
		mType.add(btnRec);
		mType.add(btnCir);
		mType.add(btnEli);
		mType.add(btnLin);

		mWight.add(btnLine5);
		mWight.add(btnLine10);
		mWight.add(btnLine15);

		btnColor.addActionListener(cmd.aColor);
		btnRed.addActionListener(cmd.aColor);
		btnYellow.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlack.addActionListener(cmd.aColor);
		btnCyan.addActionListener(cmd.aColor);
		
		btnLine5.addActionListener(cmd.aLine);
		btnLine10.addActionListener(cmd.aLine);
		btnLine15.addActionListener(cmd.aLine);
			
		btnCur.addActionListener(cmd.aType);
		btnRec.addActionListener(cmd.aType);
		btnCir.addActionListener(cmd.aType);
		btnEli.addActionListener(cmd.aType);
		btnLin.addActionListener(cmd.aType);

	}
}
