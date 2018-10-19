package paint_raster;

import javax.swing.JMenuItem;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class pMenu extends JMenuBar
{

	PCommand cmd = null;
	JMenu mFile = new JMenu("File");
	JMenuItem menuOpenFile = new JMenuItem("Open File");
	JMenuItem menuSaveFile = new JMenuItem("Save File"); // menuSaveFile
	
	JMenu mType = new JMenu("Type");
	JMenuItem btnCur = new JMenuItem("Curves");
	JMenuItem btnRec = new JMenuItem("Rectangel");
	JMenuItem btnCir = new JMenuItem("Circle");
	JMenuItem btnEli = new JMenuItem("Ellipse");
	JMenuItem btnLin = new JMenuItem("Line");
	
	JMenu mWight = new JMenu("Wight");
	
	JMenu mColor = new JMenu("Color");
	JMenuItem btnColor = new JMenuItem("Color");
	JMenuItem btnRed = new JMenuItem("Red");
	JMenuItem btnYellow = new JMenuItem("Yellow");
	JMenuItem btnGreen = new JMenuItem("Green");
	JMenuItem btnBlack = new JMenuItem("Black");
	JMenuItem btnCyan = new JMenuItem("Cyan");

	JMenuItem btnLine5 = new JMenuItem("Line Thickness - 5");
	JMenuItem btnLine10 = new JMenuItem("Line Thickness - 10");
	JMenuItem btnLine15 = new JMenuItem("Line Thickness - 15");

	public pMenu ( PCommand cmd )
	{
		this.cmd = cmd;
		setBackground(new Color ( 0, 255, 0));
		
		menuSaveFile.addActionListener(cmd.aSave);
		mFile.add(menuSaveFile);
		menuOpenFile.addActionListener(cmd.aOpen);
		mFile.add(menuOpenFile);
		add(mFile);
		
		btnCur.addActionListener(cmd.aType);
		btnRec.addActionListener(cmd.aType);
		btnCir.addActionListener(cmd.aType);
		btnEli.addActionListener(cmd.aType);
		btnLin.addActionListener(cmd.aType);
		
		mType.add(btnCur);
		mType.add(btnRec);
		mType.add(btnCir);
		mType.add(btnEli);
		mType.add(btnLin);
		add(mType);
		
		mColor.add(btnColor);
		mColor.add( btnRed );
		mColor.add( btnYellow );
		mColor.add( btnGreen );
		mColor.add( btnBlack );
		mColor.add( btnCyan );
		
		btnColor.addActionListener(cmd.aColor);
		btnRed.addActionListener(cmd.aColor);
		btnYellow.addActionListener(cmd.aColor);
		btnGreen.addActionListener(cmd.aColor);
		btnBlack.addActionListener(cmd.aColor);
		btnCyan.addActionListener(cmd.aColor);
		add(mColor);
		
		mWight.add(btnLine5);
		mWight.add(btnLine10);
		mWight.add(btnLine15);
		btnLine5.addActionListener(cmd.aLine);
		btnLine10.addActionListener(cmd.aLine);
		btnLine15.addActionListener(cmd.aLine);
		
		add(mWight);
		
		
		
//		menuOpenFile.addActionListener(cmd.aOpen);
//		menuSaveFile.addActionListener(cmd.aSave);
//		btnCur.addActionListener(cmd.aCur);
//		btnRec.addActionListener(cmd.aRec);
//		btnCir.addActionListener(cmd.aCir);
//		btnEli.addActionListener(cmd.aEli);
//		btnLin.addActionListener(cmd.aLin);
//
//		btnColor.addActionListener(cmd.aColor);
//		btnRed.addActionListener(cmd.aRed);
//		btnYellow.addActionListener(cmd.aYellow);
//		btnGreen.addActionListener(cmd.aGreen);
//		btnBlack.addActionListener(cmd.aBlack);
//		btnCyan.addActionListener(cmd.aCyan);
//
//		add(btnColor);
//		mFile.setBounds(0, 0, 50, 30);
//
//		mFile.add ( menuSaveFile ); // menuSaveFile
//		mFile.add ( menuOpenFile ); // menuOpenFile
//
//		mType.add(btnCur);
//		mType.add(btnRec);
//		mType.add(btnCir);
//		mType.add(btnEli);
//		mType.add(btnLin);
//
//		mWight.add(btnLine5);
//		mWight.add(btnLine10);
//		mWight.add(btnLine15);
//
//		mColor.add(btnColor);
//		mColor.add( btnRed );
//		mColor.add( btnYellow );
//		mColor.add( btnGreen );
//		mColor.add( btnBlack );
//		mColor.add( btnCyan );

	}
}

//	veFile.addActionListener( new ActionListener() 
//		{
//			@Override
//			public void actionPerformed(ActionEvent e) 
//			{
//				//				JFileChooser fileSave = new JFileChooser();
//				//				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
//				//				fileSave.addChoosableFileFilter(filter);
//				//				fileSave.showDialog(null, "XZ");
//				//				File file = new File (fileSave.getSelectedFile().getAbsolutePath() + ".jpg");
//				//				new FileSave(data.buf, file);
//
//				JFileChooser SaveFile = new JFileChooser();
//				SaveFile.setCurrentDirectory(new File("C:\\"));
//				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG and JPEG", new String[] { "JPG", "JPEG" });
//				SaveFile.setFileFilter(filter);
//				SaveFile.setAcceptAllFileFilterUsed(false);
//				//				fileopen.showDialog(null, "XZ");
//				int flack = SaveFile.showDialog(null, "777");
//				if ( flack == JFileChooser.APPROVE_OPTION)
//				{
//					File file = SaveFile.getSelectedFile();
//
//				}
//				JFileChooser saveFile = new JFileChooser();
//				int ret = saveFile.showDialog(null, "Сохранить картинку");
//				if ( ret == JFileChooser.APPROVE_OPTION )
//				{
//					File file = saveFile.getSelectedFile(); // для open также
////				XZData.	ImageIO.write(im, formatName, output) // buff
//				data.buf = ImageIO.write(buf, "JPEG", file);
//					
//				}
//				JFileChooser fileSave = new JFileChooser();
//				fileSave.setCurrentDirectory( new File("C:\\"));
//				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG and JPEG", new String[] { "JPG", "JPEG" });
//				fileSave.setFileFilter(filter);
//				fileSave.setAcceptAllFileFilterUsed(false);
//
//			}
//		});
//		menuOpenFile.addActionListener( new ActionListener() 
//		{
//			@Override
//			public void actionPerformed(ActionEvent arg0) 
//			{
//				
//			}
//		});
//
//
//	}
//}
