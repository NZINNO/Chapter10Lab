import java.awt.*;
import java.applet.*;

public class SmileFace extends Face{

  private int startX;
  private int startY;
  private int width;
  private int height;
  private int startAngle;
  private int arcAngle;

  public SmileFace(){
    startX = 45;
    startY = 125;
    width = 100;
    height = 50;
    startAngle = 0;
    arcAngle = 90;
  }
  public static void superdrawFace(Graphics g){
    g.setColor(new Color(0,0,0));
    g.fillArc(45,125,100,50,0,90);
}
}
