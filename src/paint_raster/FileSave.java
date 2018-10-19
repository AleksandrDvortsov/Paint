package paint_raster;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FileSave 
{
	XZData data =null;
	public FileSave (BufferedImage buf, File file)
	{
		try 
		{
			 File outputfile = new File("saved.png");
			ImageIO.write(data.buf, "jpg", outputfile);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
