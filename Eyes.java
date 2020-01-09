import java.awt.*;
import java.applet.*;

public class Eyes{
  private Color color;
  private int startX;
  private int startY;
  private int width;
  private int height;

  public Eyes(){
    color = new Color(0,0,0);
    startX = 35;
    startY = 45;
    width = 25;
    height = 25;
  }
  public Eyes(int startX, int startY, int width, int height, Color color){
    this.color = color;
    this.startX = startX;
    this.startY = startY;
    this.width = width;
    this.height = height;
  }

    public static void drawEyes(Graphics g){
      g.setColor(color);
      g.fillOval(startX, startY, width, height);
      g.fillOval(startX + 125, startY, width, height);
    }

}
