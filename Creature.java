import java.awt.*;

public interface Creature 
{
	public void drawAnimal(Graphics g);
	
	public int getX();
	
	public int getY();
	
	public void move(int dx, int dy);
	
	public void drag(int mx, int my);
}
