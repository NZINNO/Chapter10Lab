import java.awt.*;
import java.applet.*;
public class Face{
  private Color color;
  private int startX;
  private int startY;
  private int width;
  private int height;

  public Face(){
    startX = 10;
    startY = 10;
    width = 200;
    height = 200;
    color = new Color(255,255,0);
    Nose myNose = new Nose(100,115,10,10, new Color(0,0,0));
    Eyes myEyes = new Eyes(35,45,25,25, new Color(0,0,0));
  }

  public Face(int startX, int startY, Color color){
    this.startX = startX;
    this.startY = startY;
    this.width = width;
    this.height = height;
    this.color = color;
    Nose myNose = new Nose(startX + width/2,startY + height/4,width/2, Color.yellow);
    Eyes myEyes = new Eyes(startX + width/3,startY + height/2, width/2, Color.black);

  }
  public void drawFace(Graphics g){
      g.setColor(color);
      g.fillOval(startX, startY, width, height);
      Nose.drawNose(g);
      Eyes.drawEyes(g);
    }
  }
