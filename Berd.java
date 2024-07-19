import java.awt.*;
import java.awt.geom.*;

public class Berd implements Creature
{
	private int x,y;
	private Polygon nose;
	
	public Berd()
	{
		x = 1260;
		y = 400;
		
		nose = new Polygon(new int[] {x - 45, x+25, x+35}, new int[] {y+20, y+5, y+20}, 3);
	}
	
	public void drawAnimal(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
		Ellipse2D.Double body = new Ellipse2D.Double(x, y, 90, 70);
		g2.draw(body);
		g2.setColor(Color.WHITE);
		g2.fill(body);
		
		g2.setColor(Color.BLACK);
		g2.draw(nose);
		g2.setColor(Color.WHITE);
		g2.fill(nose);
		g2.drawLine(x+25, y+5, x+35, y+20);
		
		g2.setColor(Color.BLACK);
		Ellipse2D.Double eye1 = new Ellipse2D.Double(x+25, y+7, 7, 7);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(x+60, y+20, 7, 7);
		g2.fill(eye1);
		g2.fill(eye2);
		
		//leg1
		g2.drawLine(x-10, y+63, x+16, y+63);
		g2.drawLine(x-10, y+63, x-10, y+58);
		//leg2
		g2.drawLine(x+20, y+70, x+56, y+70);
		g2.drawLine(x+20, y+70, x+20, y+65);

		//wing
		g2.drawLine(x+63, y+43, x+67, y+54);
		g2.drawLine(x+70, y+43, x+67, y+54);
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
		
		nose.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		nose = new Polygon(new int[] {mx - 45, mx+25, mx+35}, new int[] {my+20, my+5, my+20}, 3);
	}
}
