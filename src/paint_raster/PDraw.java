package paint_raster;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

import paint_vector2.PLine;

public class PDraw extends JPanel implements MouseListener, MouseMotionListener
{
	XZData data = null;
	//	PCommand cmd = null;
	int x;
	int y;


	ArrayList<PShape> pp = new ArrayList <PShape>();

	public PDraw ( XZData data, PCommand cmd )
	{
		this.data = data;
		setLayout(null); 
		setBackground(Color.pink);
		XZData.buf = new BufferedImage(1010, 620, BufferedImage.TYPE_INT_RGB);
		XZData.buf.getGraphics().fillRect(0, 0, 1010, 620);
		addMouseListener(this);
		addMouseMotionListener(this);		
		ContextMenu cm = new ContextMenu(cmd);
		setComponentPopupMenu(cm);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) 
	{

		int x2 = arg0.getX();
		int y2 = arg0.getY();
		if ((arg0.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK)) return;
		if ( !data.typ.equals("Curves"))
			return;

		PShape shp = new  pCurves();
		shp.init(x, y, x2, y2, data.width, data.col, data.typ);
		shp.draw( ( Graphics2D ) XZData.buf.getGraphics());
		x = x2;
		y = y2;
		repaint();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{

		x = arg0.getX();
		y = arg0.getY();	

	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		int x2 = arg0.getX();
		int y2 = arg0.getY();
		if ( arg0.getButton() == MouseEvent.BUTTON1)
		{
			if ( data.typ.equals("Curves"))
				return;

			PShape shp = null;
			switch (data.typ) 
			{
			case "Rectangle": shp = new pRectangle();
			break;
			case "Сircle": shp = new pСircle();
			break;
			case "Ellipse": shp = new pEllipse();
			break;
			case "Line": shp = new pLine();
			break;
			}
			if ( shp != null )
			{
				shp.init(x, y, x2, y2, data.width, data.col, data.typ);
				shp.draw( ( Graphics2D ) XZData.buf.getGraphics());
				x = x2;
				y = y2;
			}
		}
			repaint();
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(XZData.buf,0,0,null);
	}
}