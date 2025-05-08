import java.applet.Applet;
import java.awt.*;

public class appleteg extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(Color.blue);
  g.fillOval(50,100,50,50);
  g.setColor(Color.yellow);
  g.drawRect(150,100,70,30);
  g.setColor(Color.red);
  g.drawLine(250,200,50,200);
  
 }
}
