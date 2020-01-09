import java.awt.*;
import java.applet.*;
public class Nose{
  private Color color;
  private int startX;
  private int startY;
  private int width;
  private int height;

  public Nose(){
  startX = 105;
  startY = 115;
  width = 10;
  height = 10;
  color = new Color(0,0,0);
}
public Nose(int startX, int startY, int width, int height, Color color){
  this.startX = startX;
  this.startY = startY;
  this.width = width;
  this.height = height;
  this.color = color;
}
    public static void drawNose(Graphics g){
      g.setColor(new Color(0,0,0));
      g.fillOval(105,115,10,10);
      g.fillOval(115,115,10,10);


}
}
