import java.awt.*;
import java.awt.geom.*;

public class Duck implements Creature
{
	private int x, y;
	private Rectangle head, neck, rightshank, leftshank;
	private Polygon beak, wing, tail;
	
	public Duck()
	{
		x = 800;
		y = 280;
		
		head = new Rectangle(x+10, y+10, 30, 30);
		neck = new Rectangle(x+20, y+35, 20, 40);
		leftshank = new Rectangle(x+30, y+90,15,20);
		rightshank = new Rectangle(x+70, y+90,15,20);
		
		beak = new Polygon(new int[] {x-10, x+10, x+10}, new int[] {y+25, y+15, y+30}, 3);
		wing = new Polygon(new int[] {x+90, x+40, x+40}, new int[] {y+80, y+70, y+90}, 3);
		tail = new Polygon(new int[] {x+130, x+90, x+90}, new int[] {y+80, y+65, y+95}, 3);
	}
	
	public void drawAnimal(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.WHITE);
		g2.draw(rightshank);
		g2.fill(rightshank);
		g2.draw(leftshank);
		g2.fill(leftshank);
		g2.draw(neck);
		g2.fill(neck);
		g2.draw(tail);
		g2.fill(tail);
		
		g2.setColor(Color.lightGray);
		g2.draw(neck);
		g2.draw(leftshank);
		g2.draw(rightshank);
		g2.draw(tail);
		g2.draw(beak);
		
		Ellipse2D.Double body= new Ellipse2D.Double(x+10, y+60, 100, 40);
	    Ellipse2D.Double eye= new Ellipse2D.Double(x+23, y+15, 8, 8);
	    Ellipse2D.Double rightfoot = new Ellipse2D.Double(x+60, y+105, 25, 10);
	    Ellipse2D.Double leftfoot= new Ellipse2D.Double(x+20, y+105, 25, 10);
		
		g2.setColor(Color.WHITE);
		g2.fill(body);
		g2.draw(body);
	

		
		g2.setColor(Color.ORANGE);
		g2.draw(beak);
		g2.fill(beak);
		g2.draw(rightfoot);
		g2.fill(rightfoot);
		g2.draw(leftfoot);
		g2.fill(leftfoot);
		
		
		g2.setColor(Color.WHITE);
		g2.fill(head);
		
		g2.setColor(Color.lightGray);
		g2.draw(body);
		g2.draw(head);
		
		
		g2.setColor(Color.BLACK);
		g2.draw(eye);
		g2.fill(eye);
		
		g2.setColor(Color.lightGray);
		g2.draw(wing);
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
		
		head.translate(dx, dy);
		neck.translate(dx, dy);
		leftshank.translate(dx, dy);
		rightshank.translate(dx, dy);
		
		beak.translate(dx, dy);
		wing.translate(dx, dy);
		tail.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		head = new Rectangle(mx+10, my+10, 30, 30);
		neck = new Rectangle(mx+20, my+35, 20, 40);
		leftshank = new Rectangle(mx+30, my+90,15,20);
		rightshank = new Rectangle(mx+70, my+90,15,20);
		
		beak = new Polygon(new int[] {mx-10, mx+10, mx+10}, new int[] {my+25, my+15, my+30}, 3);
		wing = new Polygon(new int[] {mx+90, mx+40, mx+40}, new int[] {my+80, my+70, my+90}, 3);
		tail = new Polygon(new int[] {mx+130, mx+90, mx+90}, new int[] {my+80, my+65, my+95}, 3);
	}
}
