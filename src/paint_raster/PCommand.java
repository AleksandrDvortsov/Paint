package paint_raster;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class PCommand 
{
	XZData data = null;
	public PDraw pd = null;
	
	// COLOR
	ActionColor aColor = new ActionColor();

	// TYPE
	ActionType aType = new ActionType();

	// WIGHT
	ActionWight aLine = new ActionWight();

	// SAVE/LOAD
	ActionSave aSave = new ActionSave();
	ACtionLoadFile aOpen = new ACtionLoadFile();
	ActionEraser aEraser = new ActionEraser();

	public PCommand ( XZData data, PDraw pd )
	{
		this.data = data;
	}
	public void setDrw(PDraw pd)
	{
		this.pd = pd;
	}

	class ActionType implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String strType = e.getActionCommand();
			switch (strType) 
			{
			case "Curves": data.typ = "Curves";
			break;
			case "Rectangle": data.typ = "Rectangle";
			break;
			case "Сircle": data.typ = "Сircle";
			break;
			case "Ellipse": data.typ = "Ellipse";
			break;
			case "Line": data.typ = "Line";
			break;
			}
		}
	}

	class ActionColor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
			switch (str) 
			{
			case "Color": data.col = JColorChooser.showDialog(null, "xz", data.col);	
			break;
			case "Red": //data.col(Color.red.getRGB());
				data.col = new Color(255, 0, 0);
				break;
			case "Yellow": data.col = new Color(255, 255, 0);
			break;
			case "Green": data.col = new Color(0, 255, 0);
			break;
			case "Black": data.col = new Color(0, 0, 0);
			break;
			case "Cyan": data.col = new Color(0, 255, 255);
			break;
			}
		}
	}

	class ActionWight implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String strWight = e.getActionCommand();
			switch (strWight) 
			{
			case "Line Thickness - 5": data.width = 5;
			break;
			case "Line Thickness - 10": data.width = 10;
			break;
			case "Line Thickness - 15": data.width = 15;
			break;
			}
		}
	}

	class ActionEraser implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			data.width = 5;
			data.col = new Color(255, 255, 255);
		}
	}

	class ActionSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JFileChooser saveFile = new JFileChooser();
			saveFile.setCurrentDirectory( new File("D:\\"));
			int ret = saveFile.showDialog(null, "Сохранить картинку");
			if ( ret == JFileChooser.APPROVE_OPTION )
			{
				File file = saveFile.getSelectedFile(); // для open также

				try 
				{
					ImageIO.write(XZData.buf, "JPEG", new File("" + saveFile.getSelectedFile() + ".jpg"));
				} catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		}
	}
	class ACtionLoadFile implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JFileChooser openFile = new JFileChooser();
			openFile.setCurrentDirectory( new File("D:\\"));
			int ret = openFile.showDialog(null, "Открыть картинку");
			if ( ret == JFileChooser.APPROVE_OPTION )
			{
				File file = openFile.getSelectedFile(); // для open также

				try 
				{
					XZData.buf = ImageIO.read(openFile.getSelectedFile());
					pd.repaint();
				} catch (IOException e1) 
				{
					JOptionPane.showMessageDialog(null, "XZ");
				}
			}
			
		}
	}
	
}

