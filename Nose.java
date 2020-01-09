import java.awt.*;
import java.applet.*;

public class Nose{
  private Color color;
  private int startX;
  private int startY;
  private int width;
  private int height;

  public Nose(){
    color = new Color(0,0,0);
    startX = 100;
    startY = 115;
    width = 10;
    height = 10;
}
  public Nose(int startX, int startY, int width, int height, Color color){
    this.color = color;
    this.startX = startX;
    this.startY = startY;
    this.width = width;
    this.height = height;

  }
  public void drawNose(Graphics g){
    g.setColor(color);
    g.fillOval(startX, startY, width, height);
    g.fillOval(startX + 10, startY, width, height);
// Draw the Nose

  }


}
