import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import java.io.IOException;
import java.util.*;

public class HappyU_Farm_Component extends JComponent
{
	private ArrayList <Creature> animals_left, animals_right;
    private BufferedImage bowser;
    private Timer t;
    
    public HappyU_Farm_Component()
    {
    	super();
    	try 
    	{
			bowser = ImageIO.read(getClass().getResource("background3.jpg"));
		} 
    	catch (IOException e) 
    	{
			e.printStackTrace();
		}
    	
    	animals_left = new ArrayList<Creature>();
    	animals_right = new ArrayList<Creature>();
    }
    
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
	    g2.drawImage(bowser, new AffineTransform(), null);

	    for(int i=0;i<animals_left.size();i++)
	    {
	    	animals_left.get(i).drawAnimal(g2);
	    }
	    
	    for(int i=0;i<animals_right.size();i++)
	    {
	    	animals_right.get(i).drawAnimal(g2);
	    }
	}
	
	public void createAnimal(ArrayList <Creature> list, String place)
	{
		switch (place)
		{
		case "right":
			
			animals_right = list;
			repaint();
			break;
			
		case "left":
			
			animals_left = list;
			repaint();
			break;
		}
	}
	
	public void moveAnimal()
	{
	    ActionListener listener = new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent event)
	        {
	    		for(int i=0;i<animals_right.size();i++)
	    	    {
	    			animals_right.get(i).move(-1,0);
	    			repaint();
	    	    }
	    		
	    		for(int i=0;i<animals_left.size();i++)
	    	    {
	    			animals_left.get(i).move(1,0);
	    			repaint();
	    	    }
	        }
	    };
    	final int DELAY = 50; // Milliseconds between timer ticks
    	t = new Timer(DELAY, listener);
	    t.start();
	}
	
	public void dragAnimal(int mx, int my)
	{
		t.stop();
		
		for(int i=0;i<animals_right.size();i++)
	    {
			animals_right.get(i).drag(mx,my);
			repaint();
	    }
		
		for(int i=0;i<animals_left.size();i++)
	    {
			animals_left.get(i).drag(mx,my);
			repaint();
	    }
		
		t.start();
	}
}
