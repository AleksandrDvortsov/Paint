package paint_raster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MToolBar extends JToolBar
{
	public MToolBar ( PCommand cmd )
	{	
		JToolBar btnToolbar = new JToolBar();

		ImageIcon type1 = new ImageIcon("src/type1.png");
		ImageIcon type2 = new ImageIcon("src/type2.png");
		ImageIcon type3 = new ImageIcon("src/type3.png");
		ImageIcon type4 = new ImageIcon("src/type4.png");
		ImageIcon type5 = new ImageIcon("src/type5.png");

		ImageIcon Color = new ImageIcon("src/color.png");
		ImageIcon Red = new ImageIcon("src/red.png");
		ImageIcon Yellow = new ImageIcon("src/yellow.png");
		ImageIcon Green = new ImageIcon("src/green.png");
		ImageIcon Black = new ImageIcon("src/black.png");
		ImageIcon Cyan = new ImageIcon("src/cyan.png");
		
		ImageIcon Linewidth5 = new ImageIcon("src/line5.png");
		ImageIcon Linewidth10 = new ImageIcon("src/line10.png");
		ImageIcon Linewidth15 = new ImageIcon("src/line20.png");

		ImageIcon eraser = new ImageIcon("src/eraser.png");
		ImageIcon ex = new ImageIcon("src/exite.png");

		JButton btnCur = new JButton(type1);
		JButton btnRec = new JButton(type2);
		JButton btnCir = new JButton(type3);
		JButton btnEli = new JButton(type4);
		JButton btnLin = new JButton(type5);

		JButton btnColor = new JButton(Color);
		JButton btnRed = new JButton(Red);
		JButton btnYellow = new JButton(Yellow);
		JButton btnGreen = new JButton(Green);
		JButton btnBlack = new JButton(Black);
		JButton btnCyan = new JButton(Cyan);
		
		JButton btnLine5 = new JButton(Linewidth5);
		JButton btnLine10 = new JButton(Linewidth10);
		JButton btnLine15 = new JButton(Linewidth15);

		JButton Eraser = new JButton(eraser);
		JButton btnExite = new JButton(ex);
		
		btnColor.setActionCommand("Color");
		btnRed.setActionCommand("Red");
		btnYellow.setActionCommand("Yellow");
		btnGreen.setActionCommand("Green");
		btnBlack.setActionCommand("Black");
		btnCyan.setActionCommand("Cyan");
		
		btnCur.setActionCommand("Curves");
		btnRec.setActionCommand("Rectangle");
		btnCir.setActionCommand("Сircle");
		btnEli.setActionCommand("Ellipse");
		btnLin.setActionCommand("Line");
		
		btnLine5.setActionCommand("Line Thickness - 5");
		btnLine10.setActionCommand("Line Thickness - 10");
		btnLine15.setActionCommand("Line Thickness - 15");

		btnToolbar.add(btnCur);
		btnToolbar.add(btnRec);
		btnToolbar.add(btnCir);
		btnToolbar.add(btnEli);
		btnToolbar.add(btnLin);

		btnToolbar.add(btnColor);
		btnToolbar.add(btnRed);
		btnToolbar.add(btnYellow);
		btnToolbar.add(btnGreen);
		btnToolbar.add(btnBlack);
		btnToolbar.add(btnCyan);
		
		btnToolbar.add(btnLine5);
		btnToolbar.add(btnLine10);
		btnToolbar.add(btnLine15);
		
		btnToolbar.add(Eraser);
		btnToolbar.add(btnExite);

		btnCur.addActionListener(cmd.aType);
		btnRec.addActionListener(cmd.aType);
		btnCir.addActionListener(cmd.aType);
		btnEli.addActionListener(cmd.aType);
		btnLin.addActionListener(cmd.aType);

		btnColor.addActionListener(cmd.aColor);
		btnRed.addActionListener(cmd.aColor);
		btnYellow.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlack.addActionListener(cmd.aColor);
		btnCyan.addActionListener(cmd.aColor);

		btnLine5.addActionListener(cmd.aLine);
		btnLine10.addActionListener(cmd.aLine);
		btnLine15.addActionListener(cmd.aLine);
		
		Eraser.addActionListener(cmd.aEraser);
		
		btnExite.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		add(btnToolbar);//, BorderLayout.BEFORE_LINE_BEGINS);
		setBounds(10, 5, 1035, 70);
	}
}
