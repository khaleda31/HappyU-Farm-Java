import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HappyU_Farm_GUI extends JFrame
{
	private ArrayList <Creature> animals_left, animals_right;
	private HappyU_Farm_Component comp;
	
	public HappyU_Farm_GUI()
	{
		animals_left = new ArrayList<Creature>();
		animals_right = new ArrayList<Creature>();
		setSize(1815, 775);
	    setTitle("HappyU Farm");
	    setLocation(-10, 0);
	    
	    comp = new HappyU_Farm_Component();
	    String [] array = {"(Select an Animal)", "Bird", "Pig", "Duck", "Berd", "Sheep", "???"};
	    JComboBox <String> animal_list = new JComboBox<String>(array);
	    JButton clear = new JButton("Clear Animals");
	    
	    animal_list.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		String s = (String) animal_list.getSelectedItem();
	    		
	    		switch (s)
	    		{
	    		case "Sheep":
	    			Sheep sheep = new Sheep();
	    			animals_left.add(sheep);
	    			comp.createAnimal(animals_left, "left");
	    			break;
	    		case "Pig":
	    			Pig pig  = new Pig();
	    			animals_right.add(pig);
	    			comp.createAnimal(animals_right, "right");
	    			break;
	    		case "Duck":
	    			Duck duck  = new Duck();
	    			animals_right.add(duck);
	    			comp.createAnimal(animals_right, "right");
	    			break;
	    		case "???":
	    			Steve st  = new Steve();
	    			animals_right.add(st);
	    			comp.createAnimal(animals_right, "right");
	    			break;
	    		case "Bird":
	    			Bird bird  = new Bird();
	    			animals_left.add(bird);
	    			comp.createAnimal(animals_left, "left");
	    			break;
	    		case "Berd":
	    			Berd funny  = new Berd();
	    			animals_right.add(funny);
	    			comp.createAnimal(animals_right, "right");
	    			break;
	    		}
	    	}	
	    });
	    
	    comp.addMouseMotionListener(new MouseMotionListener()
	    {
	    	public void mouseDragged(MouseEvent e)
	    	{
	    		int mx = (int) e.getPoint().getX(); 
	    		int my = (int) e.getPoint().getY();
	    		
	    		comp.dragAnimal(mx, my);
	    	}

			public void mouseMoved(MouseEvent e) {}
	    });
	    
	    comp.moveAnimal();
	    
	    clear.addMouseListener(new MouseAdapter() 
	    {
	    	public void mouseClicked(MouseEvent e)
	    	{
	    		animals_left.removeAll(animals_left);
	    		animals_right.removeAll(animals_right);
	    		comp.createAnimal(animals_left, "left");
	    		comp.createAnimal(animals_right, "right");
	    	}
	    });
	    
	    add(comp, BorderLayout.CENTER);
	    add(animal_list, BorderLayout.NORTH);
	    add(clear, BorderLayout.SOUTH);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	public static void main (String [] args)
	{
		JFrame frame = new HappyU_Farm_GUI();
	}
}
