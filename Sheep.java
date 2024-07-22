import java.awt.*;
import java.awt.geom.*;

public class Sheep implements Creature
{
	private int x, y;
	private Rectangle r1, r2, r3, r4, r5, r6, r7, r8;
	
	public Sheep()
	{
		x = 50;
		y = 400;
		
		r1 = new Rectangle(x+25, y+100, 15, 55);
		r2 = new Rectangle(x+50, y+120, 15, 50);
		r3 = new Rectangle(x+90, y+120, 15, 50);
		r4 = new Rectangle(x+115, y+120, 15, 50);
		r5 = new Rectangle(x+25, y+155, 15, 15);
		r6 = new Rectangle(x+50, y+155, 15, 15);
		r7 = new Rectangle(x+90, y+155, 15, 15);
		r8 = new Rectangle(x+115, y+155, 15, 15);
	}
	
	public void drawAnimal(Graphics g)
	{
	      Graphics2D g2 = (Graphics2D) g;
	      
	      // Draw the legs
	      g2.setColor(Color.GRAY);
	      g2.fill(r1);
	      g2.fill(r2);
	      g2.fill(r3);
	      g2.fill(r4);
	      
	      g2.setColor(Color.BLACK);
	      g2.fill(r5);
	      g2.fill(r6);
	      g2.fill(r7);
	      g2.fill(r8);
	       
	        
	      // Draw the body 
	      g2.setColor(Color.WHITE);
	      Ellipse2D.Double e1 = new Ellipse2D.Double(x+5, y+15, 155, 105);
	      g2.fill(e1);
	      Ellipse2D.Double e2 = new Ellipse2D.Double(x+3, y+35, 50, 50);
	      g2.fill(e2);
	      Ellipse2D.Double e3 = new Ellipse2D.Double(x, y+50, 50, 50);
	      g2.fill(e3);
	      Ellipse2D.Double e4 = new Ellipse2D.Double(x+5, y+60, 50, 50);
	      g2.fill(e4);
	      Ellipse2D.Double e5 = new Ellipse2D.Double(x+7, y+70, 50, 50);
	      g2.fill(e5);
	      Ellipse2D.Double e6 = new Ellipse2D.Double(x+27, y+80, 50, 50);
	      g2.fill(e6);
	      Ellipse2D.Double e7 = new Ellipse2D.Double(x+47, y+85, 50, 50);
	      g2.fill(e7);
	      Ellipse2D.Double e8 = new Ellipse2D.Double(x+67, y+87, 50, 50);
	      g2.fill(e8);
	      Ellipse2D.Double e9 = new Ellipse2D.Double(x+87, y+82, 50, 50);
	      g2.fill(e9);
	      Ellipse2D.Double e10 = new Ellipse2D.Double(x+105, y+70, 50, 50);
	      g2.fill(e10);
	      Ellipse2D.Double e11 = new Ellipse2D.Double(x+120, y+55, 50, 50);
	      g2.fill(e11);
	      Ellipse2D.Double e12 = new Ellipse2D.Double(x+115, y+40, 50, 50);
	      g2.fill(e12);
	      Ellipse2D.Double e13 = new Ellipse2D.Double(x+15, y+20, 50, 50);
	      g2.fill(e13);
	      Ellipse2D.Double e14 = new Ellipse2D.Double(x+30, y+10, 50, 50);
	      g2.fill(e14);
	      Ellipse2D.Double e15 = new Ellipse2D.Double(x+45, y+5, 50, 50);
	      g2.fill(e15);
	      Ellipse2D.Double e16 = new Ellipse2D.Double(x+60, y, 50, 50);
	      g2.fill(e16);
	      Ellipse2D.Double e17 = new Ellipse2D.Double(x+85, y+7, 50, 50);
	      g2.fill(e17);
	      Ellipse2D.Double e18 = new Ellipse2D.Double(x+100, y+15, 50, 50);
	      g2.fill(e18);

	      // Draw the head
	      g2.setColor(Color.GRAY);
	      Ellipse2D.Double c1 = new Ellipse2D.Double(x+140, y+15, 50, 75);
		  g2.fill(c1);
	      Ellipse2D.Double c2 = new Ellipse2D.Double(x+135, y+40, 60, 50);
		  g2.fill(c2);
		    
		  // Draw the hair
		  g2.setColor(Color.WHITE);
		  Ellipse2D.Double h0 = new Ellipse2D.Double(x+135, y, 60, 30);
		  g2.fill(h0);
		  Ellipse2D.Double h1 = new Ellipse2D.Double(x+133, y+6, 25, 25);
		  g2.fill(h1);
		  Ellipse2D.Double h2 = new Ellipse2D.Double(x+145, y+10, 25, 25);
		  g2.fill(h2);
		  Ellipse2D.Double h3 = new Ellipse2D.Double(x+161, y+10, 25, 25);
		  g2.fill(h3);
		  Ellipse2D.Double h4 = new Ellipse2D.Double(x+170, y+6, 25, 25);
		  g2.fill(h4);
		  Ellipse2D.Double h5 = new Ellipse2D.Double(x+173, y-2, 25, 25);
		  g2.fill(h5);
		  Ellipse2D.Double h6 = new Ellipse2D.Double(x+165, y-5, 25, 25);
		  g2.fill(h6);
		  Ellipse2D.Double h7 = new Ellipse2D.Double(x+150, y-5, 25, 25);
		  g2.fill(h7);
		  Ellipse2D.Double h8 = new Ellipse2D.Double(x+138, y-2, 25, 25);
		  g2.fill(h8);
		    
		  // Draw the eyes
		  Ellipse2D.Double m1 = new Ellipse2D.Double(x+150, y+40, 10, 15);
		  g2.fill(m1);
		  Ellipse2D.Double m2 = new Ellipse2D.Double(x+152, y+43, 6, 9);
		  g2.setColor(Color.BLACK);
		  g2.fill(m2);
		  Ellipse2D.Double m3 = new Ellipse2D.Double(x+170, y+40, 10, 15);
		  g2.setColor(Color.WHITE);
		  g2.fill(m3);
		  Ellipse2D.Double m4 = new Ellipse2D.Double(x+172, y+43, 6, 9);
		  g2.setColor(Color.BLACK);
		  g2.fill(m4);
	        
	      // Draw the mouth, Color already set to BLACK
	      g2.setStroke(new BasicStroke(3));
	      g2.drawLine(x+165, y+80, x+165, y+88);
	      g2.drawArc(x+155, y+60, 20, 20, 180, 180);
	      
	      // Draw the left ear
		  Ellipse2D ellipse2 = new Ellipse2D.Double(x + 120, y + 35, 30, 20);
	      g2.setColor(Color.GRAY);
	      g2.fill(ellipse2);
	        
	      // Draw the right ear
		  Ellipse2D ellipse4 = new Ellipse2D.Double(x +180, y + 35, 30, 20);
	      g2.fill(ellipse4);
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
		
		r1.translate(dx, dy);
		r2.translate(dx, dy);
		r3.translate(dx, dy);
		r4.translate(dx, dy);
		r5.translate(dx, dy);
		r6.translate(dx, dy);
		r7.translate(dx, dy);
		r8.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		r1 = new Rectangle(mx+25, my+100, 15, 55);
		r2 = new Rectangle(mx+50, my+120, 15, 50);
		r3 = new Rectangle(mx+90, my+120, 15, 50);
		r4 = new Rectangle(mx+115, my+120, 15, 50);
		r5 = new Rectangle(mx+25, my+155, 15, 15);
		r6 = new Rectangle(mx+50, my+155, 15, 15);
		r7 = new Rectangle(mx+90, my+155, 15, 15);
		r8 = new Rectangle(mx+115, my+155, 15, 15);
	}
}
