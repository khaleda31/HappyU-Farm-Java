import java.awt.*;
import java.awt.geom.*;

public class Steve implements Creature
{
	private int x, y;
	
	private Rectangle body, leftLeg1, leftLeg2, rightLeg1, rightLeg2,
						mouthLeft, mouth, mouthRight, leftArm1, leftArm2,
						rightArm1, rightArm2;
	
	public Steve()
	{
		x = 1250;
		y = 90;
		
		mouthLeft= new Rectangle(x+5, y+30, 5, 5);
		mouth = new Rectangle(x+10, y+35, 20, 5);
		mouthRight = new Rectangle(x+30, y+30, 5, 5);
		body = new Rectangle(x -5, y+50, 50, 60);
		leftArm1 = new Rectangle(x-15, y+55, 10, 30);
		leftArm2 = new Rectangle(x-30, y+85, 25, 10);
		rightArm1 = new Rectangle(x+46, y+55, 10, 30);
		rightArm2 = new Rectangle(x+31, y+85, 25, 10);
		leftLeg1 = new Rectangle(x-5, y+110, 10, 40);
		leftLeg2 = new Rectangle(x+5, y+140, 10, 30);
		rightLeg1 = new Rectangle(x+35, y+110, 10, 40);
		rightLeg2 = new Rectangle(x+45, y+140, 10, 30);
	}
	
	public void drawAnimal(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		 // Draw the head
		BasicStroke bs = new BasicStroke();
		g2.setStroke(bs);
        g2.setColor(Color.BLACK);
        Ellipse2D.Double head = new Ellipse2D.Double(x-5, y, 50, 50);
        g2.draw(head);
        g2.setColor(Color.gray);
        g2.fill(head);

        // Draw the ears
        g2.setColor(Color.black);
        Ellipse2D.Double ear1 = new Ellipse2D.Double(x, y-8, 10, 20);
        Ellipse2D.Double ear2 = new Ellipse2D.Double(x+28, y-8, 10, 20);
        g2.fill(ear1);
        g2.fill(ear2);

        // Draw the body
        g2.setColor(Color.BLACK);
        g2.draw(body);
        g2.setColor(Color.gray);
        g2.fill(body);


        // Draw the legs
        g2.setColor(Color.BLACK);
        g2.draw(leftLeg1);
        g2.draw(leftLeg2);
        g2.draw(rightLeg1);
        g2.draw(rightLeg2);
        g2.setColor(Color.GRAY);
        g2.fill(leftLeg1);
        g2.fill(leftLeg2);
        g2.fill(rightLeg1);
        g2.fill(rightLeg2);
        
        //Eyes and mouth
        g2.setColor(Color.WHITE);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(x+5, y+15, 8, 8);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(x+25, y+15, 8, 8);
        g2.fill(eye1);
        g2.fill(eye2);
        g2.fill(mouthLeft);
        g2.fill(mouth);
        g2.fill(mouthRight);
        
        //Arms
        g2.setColor(Color.BLACK);
        g2.draw(leftArm1);
        g2.draw(leftArm2);
        g2.draw(rightArm1);
        g2.draw(rightArm2);
        g2.setColor(Color.GRAY);
        g2.fill(leftArm1);
        g2.fill(leftArm2);
        g2.fill(rightArm1);
        g2.fill(rightArm2);
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
		
		body.translate(dx, dy);
		leftLeg1.translate(dx, dy);
		leftLeg2.translate(dx, dy);
		rightLeg1.translate(dx, dy);
		rightLeg2.translate(dx, dy);
		mouthLeft.translate(dx, dy);
		mouth.translate(dx, dy);
		mouthRight.translate(dx, dy);
		leftArm1.translate(dx, dy);
		leftArm2.translate(dx, dy);
		rightArm1.translate(dx, dy);
		rightArm2.translate(dx, dy);
	}
	
	public void drag (int mx, int my)
	{
		x = mx;
		y = my;
		
		mouthLeft= new Rectangle(mx+5, my+30, 5, 5);
		mouth = new Rectangle(mx+10, my+35, 20, 5);
		mouthRight = new Rectangle(mx+30, my+30, 5, 5);
		body = new Rectangle(mx -5, my+50, 50, 60);
		leftArm1 = new Rectangle(mx-15, my+55, 10, 30);
		leftArm2 = new Rectangle(mx-30, my+85, 25, 10);
		rightArm1 = new Rectangle(mx+46, my+55, 10, 30);
		rightArm2 = new Rectangle(mx+31, my+85, 25, 10);
		leftLeg1 = new Rectangle(mx-5, my+110, 10, 40);
		leftLeg2 = new Rectangle(mx+5, my+140, 10, 30);
		rightLeg1 = new Rectangle(mx+35, my+110, 10, 40);
		rightLeg2 = new Rectangle(mx+45, my+140, 10, 30);
	}
}
