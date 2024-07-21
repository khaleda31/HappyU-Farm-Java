import java.awt.*;
import java.awt.geom.*;

public class Pig implements Creature
{
	private int x, y;
	private Rectangle frontleg1, frontleg2, hindleg1, hindleg2;
	private Polygon ear1, ear2;
	
	public Pig()
	{
		x = 1000;
		y = 400;
		
		frontleg1 = new Rectangle(x+85, y+190, 26, 75);
		frontleg2 = new Rectangle(x+120, y+190, 26, 75);
		hindleg1 = new Rectangle(x+190, y+190, 26, 75);
		hindleg2 = new Rectangle(x+230, y+190, 26, 75);
		ear1 = new Polygon(new int [] {x+30, x+42, x+54}, new int [] {y+25, y, y+25}, 3);
		ear2 = new Polygon (new int [] {x+71, x+83, x+95}, new int [] {y+25, y, y+25}, 3);
	}
	
	public void drawAnimal(Graphics g)
	{
		 Graphics2D g2 = (Graphics2D) g;
	     //front leg
	     g2.setColor(Color.BLACK);
	     g2.draw(frontleg1);
	     g2.draw(frontleg2);
	     g2.setColor(Color.PINK);
	     g2.fill(frontleg1);
	     g2.fill(frontleg2);
	      
	     //hind leg
	     g2.setColor(Color.BLACK);
	     g2.draw(hindleg1);
	     g2.draw(hindleg2);
	     g2.setColor(Color.PINK);
	     g2.fill(hindleg1);
	     g2.fill(hindleg2);
	     
	     //body
		 g2.setColor(Color.BLACK);
		 Shape body =new Ellipse2D.Double(x+75,y+75, 200, 175);
		 g2.draw(body);
		 g2.setColor(Color.PINK);
		 g2.fill(body);
		 
	     //head
	     g2.setColor(Color.BLACK);
	     Shape head = new Ellipse2D.Double(x, y+15, 125, 125);
	     g2.draw(head);
	     g2.setColor(Color.PINK);
		 g2.fill(head);
		 	     
	     //ears
	     g2.fill(ear1);
	     g2.fill(ear2);
	     
	     //nose
	     g2.setColor(Color.BLACK);
	     Shape nose = new Ellipse2D.Double(x+38, y+58, 43, 43);
	     Shape nostril1 = new Ellipse2D.Double(x+45, y+68, 10, 23);
	     Shape nostril2 = new Ellipse2D.Double(x+63, y+68, 10, 23);
	     g2.draw(nose);
	     g2.draw(nostril1);
	     g2.draw(nostril2);
	     
	     
	     //eyes
	     Shape eye1 = new Ellipse2D.Double(x+35, y+45, 10, 10);
	     g2.fill(eye1);
	     
	     Shape eye2 = new Ellipse2D.Double(x+75, y+45, 10, 10);
	     g2.fill(eye2);
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void move (int dx, int dy)
	{
		x = getX() + dx;
		y = getY() + dy;
		
		frontleg1.translate(dx, dy);		
		frontleg2.translate(dx, dy);
		hindleg1.translate(dx, dy);
		hindleg2.translate(dx, dy);
		ear1.translate(dx, dy);
		ear2.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		frontleg1 = new Rectangle(mx+85, my+190, 26, 75);
		frontleg2 = new Rectangle(mx+120, my+190, 26, 75);
		hindleg1 = new Rectangle(mx+190, my+190, 26, 75);
		hindleg2 = new Rectangle(mx+230, my+190, 26, 75);
		ear1 = new Polygon(new int [] {mx+30, mx+42, mx+54}, new int [] {my+25, my, my+25}, 3);
		ear2 = new Polygon (new int [] {mx+71, mx+83, mx+95}, new int [] {my+25, my, my+25}, 3);
	}
}
