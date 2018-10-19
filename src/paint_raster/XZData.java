package paint_raster;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.xml.bind.ParseConversionEvent;

public class XZData 
{
	private static XZData instance = null;
	
	Color col = new Color(0, 0, 0);
	String typ = "Curves";
	int width = 5;
	static BufferedImage buf;
	
	public XZData()
	{
		
	}
	
	public static XZData getInstance()
	{
		if ( instance == null )
		{
			instance = new XZData();
		}
		return instance;
	}	
}
