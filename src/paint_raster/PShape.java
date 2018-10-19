package paint_raster;

import java.awt.Color;
import java.awt.Graphics2D;

public interface PShape 
{
	void draw ( Graphics2D gg );
	void init(int x, int y, int x2, int y2, int widh, Color clr, String typ);
}
