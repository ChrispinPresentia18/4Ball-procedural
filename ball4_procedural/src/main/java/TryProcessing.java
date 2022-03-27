import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static final float SPEED1 = 1;
    public static final float SPEED2 = 2;
    public static final float SPEED3 = 3;
    public static final float SPEED4 = 4;

    float ballCoordinate1 = 0;
    float ballCoordinate2 = 0;
    float ballCoordinate3 = 0;
    float ballCoordinate4 = 0;

    public static void main(String[] args){ PApplet.main("TryProcessing", args); }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ballCoordinate1 += SPEED1,HEIGHT*1/5,DIAMETER,DIAMETER);
        ellipse(ballCoordinate2 += SPEED2,HEIGHT*2/5,DIAMETER,DIAMETER);
        ellipse(ballCoordinate3 += SPEED3,HEIGHT*3/5,DIAMETER,DIAMETER);
        ellipse(ballCoordinate4 += SPEED4,HEIGHT*4/5,DIAMETER,DIAMETER);
    }
}

