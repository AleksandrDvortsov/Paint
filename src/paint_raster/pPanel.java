package paint_raster;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class pPanel extends JPanel 
{
	XZData data = null;
	public pPanel( XZData data, PCommand cmd )
	{
		this.data = data;
		setLayout(null);
		PDraw pd = new PDraw (data, cmd);
		cmd.pd = pd;
//		XZData data = new XZData(); // передать data с pFrame

		PType tp = new PType (cmd);
		PWidth pw = new PWidth(cmd);
		PColor pc = new PColor (cmd);
//		PDraw pd = new PDraw (data);
		cmd.setDrw(pd);

		tp.setBounds(10, 80, 200, 200);
		pw.setBounds(10, 290, 200, 200);
		pc.setBounds(10, 500, 200, 200);
		pd.setBounds(220, 80, 1010, 620);

		add(tp);
		add(pw);
		add(pc);
		add(pd);
		
		add(new MToolBar(cmd));

		setBounds(0,0,1245,720);
		setBackground(Color.LIGHT_GRAY);	
	}

}