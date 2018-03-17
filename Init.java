import javax.swing.*;


public class Init
{
	public void makeWindow()
	{
		JFrame window=new JFrame();
		window.setVisible(true);
		window.setTitle("Tile Swap Game");
		window.setSize(448,360);	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

