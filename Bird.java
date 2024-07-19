import java.awt.*;
import java.awt.geom.*;

public class Bird implements Creature
{
	private int x,y;
	private Polygon beak, wing1, wing2;
	
	public Bird()
	{
		x = 55;
		y = 25;
		
		beak = new Polygon(new int[] {x+65, x+87, x+65}, new int[] {y+16, y+20, y+24}, 3);
		wing1 = new Polygon(new int[] {x+20, x+20, x+30}, new int[] {y+6, y-10, y+6}, 3);
		wing2 = new Polygon(new int[] {x+20, x+20, x+35}, new int[] {y+20, y+45, y+20}, 3);
	}
	
	public void drawAnimal(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		Ellipse2D.Double head = new Ellipse2D.Double(x+45, y, 30, 30);
		g2.fill(head);
		Ellipse2D.Double eye = new Ellipse2D.Double(x+59, y+7, 7, 7);
		g2.setColor(Color.BLACK);
		g2.fill(eye);
		
		g2.setColor(Color.ORANGE);
		Ellipse2D.Double feather = new Ellipse2D.Double(x+50, y-6, 5, 10);
		Ellipse2D.Double feather2 = new Ellipse2D.Double(x+46, y-5, 5, 10);
		g2.fill(feather);
		g2.fill(beak);
		g2.setColor(Color.BLUE);
		g2.fill(feather2);
		
		g2.setColor(Color.BLACK);
		g2.fill(wing1);
		
		Ellipse2D.Double body = new Ellipse2D.Double(x, y+5, 50, 30);
		g2.setColor(Color.BLUE);
		g2.fill(body);
		
		g2.setColor(Color.BLACK);
		g2.fill(wing2);
		
		g2.setColor(Color.ORANGE);
		g2.drawLine(x+4, y+28, x-4, y+28);
		g2.drawLine(x-4, y+28, x-4, y+32);
		g2.drawLine(x+15, y+33, x, y+33);
		g2.drawLine(x, y+33, x, y+39);
		
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
		
		beak.translate(dx, dy);
		wing1.translate(dx, dy);
		wing2.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		beak = new Polygon(new int[] {mx+65, mx+87, mx+65}, new int[] {my+16, my+20, my+24}, 3);
		wing1 = new Polygon(new int[] {mx+20, mx+20, mx+30}, new int[] {my+6, my-10, my+6}, 3);
		wing2 = new Polygon(new int[] {mx+20, mx+20, mx+35}, new int[] {my+20, my+45, my+20}, 3);
	}
}
