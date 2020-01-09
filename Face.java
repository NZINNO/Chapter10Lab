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
  private NoseColor n;
  private int NoseStartX;
  private int NoseStartY;
  private int NoseWidth;
  private int NoseHeight;

  public Face(){
    FaceStartX = 10;
    FaceStartY = 10;
    FaceWidth = 200;
    FaceHeight = 200;
    z = (255,255,0);
    b =
    EyeStartX = 60;
    EyeStartY = 120;
    EyeWidth = 25;
    EyeHeight = 25;
    n =
    NoseStartX = 110;
    NoseStartY = 110;
    NoseWidth = 15;
    noseHeight = 15;
  }

  public Face(int FaceStartX, int FaceStartY, Color z){
    this.FacestartX = FaceStartX;
    this.FacestartY = FaceStartY;
    this.FaceWidth = FaceWidth;
    this.FaceHeight = FaceHeight;
    this.z = z;
    this.EyeStartX = EyeStartX;
    this.EyesStartY = EyeStartY;
    this.EyeWidth = EyeWidth;
    this.EyeHeight =  EyeHeight;
    this.b = b;
    this.NoseStartX = NoseStartX;
    this.NoseStartY = NoseStartY;
    this.NoseWidth = NoseWidth;
    this.NoseHeight = NoseHeight;


  }
  public static void drawFace(Graphics g){
      g.setColor(z);
      g.fillOval(FacestartX, FacestartY, FaceWidth, FaceHeight);
    }
  }
