import javax.swing.*;
import java.awt.*;
public class Init
{
	private ImageIcon[] images=new ImageIcon[12];
	private JButton[] buttons=new JButton[12];
	private JPanel panels=new JPanel();
	private GridLayout grid=new GridLayout(3,4);
	private JFrame window=new JFrame();
	
	public void makeWindow()
	{
        fillWindow();
		window.setTitle("Tile Swap Game");
		window.setSize(475,400);	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void fillWindow()
	{
		for (int i=0; i<12;i++)
		{
			images[i]=new ImageIcon("bart"+i+".jpg");
			buttons[i]=new JButton(images[i]);
		}
		for (int i=0; i<12;i++)
		{
			panels.add(buttons[i]);
		}
		panels.setLayout(grid); 
		panels.setVisible(true);
		window.add(panels);
	}
}

