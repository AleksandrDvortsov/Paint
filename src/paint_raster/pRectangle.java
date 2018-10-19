package paint_raster;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class pRectangle implements PShape
{
	String typ;
	int x;
	int y;
	int x2;
	int y2;
	int width;
	Color clr;
	
	@Override
	public void draw(Graphics2D gg) 
	{
		gg.setColor(clr);
		gg.setStroke(new BasicStroke(width));
		gg.drawImage(null, x, y, x2, y2,width, width, width, width, clr, null);
		int xwidht = Math.abs( x - x2 );
		int yheight = Math.abs( y - y2 );
		x = Math.min(x, x2);
		y = Math.min(y, y2);
		gg.drawRect(x, y, xwidht, yheight);
	}

	@Override
	public void init(int x, int y, int x2, int y2, int widh, Color clr, String typ) 
	{
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.width = widh;
		this.clr = clr;
		this.typ = typ;
	}

}
