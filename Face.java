import java.awt.*;
import java.applet.*;
public class Face{
  private FaceColor z;
  private int FaceStartX;
  private int FaceStartY;
  private int FaceWidth;
  private int FaceHeight;
  private EyeColor b:
  private int EyeStartX;
  private int EyeStartY;
  private int EyeWidth;
  private int EyeHeight;

  public Face(){
    FaceStartX = 10;
    FaceStartY = 10;
    FaceWidth = 200;
    FaceHeight = 200;
    z = (255,255,0);
  }

  public Face(int FaceStartX, int FaceStartY, Color z){
    this.FacestartX = FaceStartYtartX;
    this.FacestartY = FaceStartY;
    this.z = z;


  }
  public static void drawFace(Graphics g){
      g.setColor(z);
      g.fillOval(FacestartX, FacestartY, FaceWidth, FaceHeight);
    }
  }
