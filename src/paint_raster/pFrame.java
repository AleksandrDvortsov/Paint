package paint_raster;
import javax.swing.JFrame;

public class pFrame extends JFrame 
{
	XZData data = null;
	public pFrame(XZData data)
	{
		this.data = data;
		setLayout(null);
		setBounds(10, 10, 1280, 768);
		setTitle("Painter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PCommand cmd = new PCommand(data, null);
		add(new pPanel(data, cmd));

		pMenu mnu = new pMenu(cmd);
		setJMenuBar(mnu);

		
		setVisible(true);
	}

}
