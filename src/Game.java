import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {
    PImage background;
    //starting point range for x-values (670, 680)

    //find relationship between addSize and speed

    //rectangle #1:
    private int sq1x = 670;
    private int sq1Y = 460;
    private double size1 = 7;
    private double addSize1 = 0.2;
    private int speed1 = 2;

    //rectangle #2:
    private int sq2x = 673;
    private int sq2Y = 460;
    private double size2 = 7;
    private double addSize2 = 0.2;
    private int speed2 = 2;


    public static void main(String[] args) {
        System.out.println("Welcome to Ball Run! Use the left and right arrow keys to move lanes.");

        PApplet.main("Game");
    }

    public void settings() {
        size(1400, 800);
    }

    public void setup() {
        background = loadImage("Images/pathway.jpg");
        background.resize(1400, 800);

        //by default
        frameRate(60);
    }

    public void draw() {
        //make draw methods
        //useful to have if-else statements inside of this looping method

        drawBackground();
        drawSquares();
        moveSquares();
        addSquares();
    }

    public void keyPressed() {

    }

    public void drawBackground() {
        imageMode(CORNER);
        image(background, 0, 0);
        //image(background, 0 + background.width, 0);
    }

    public void drawSquares() {
        fill(0, 255, 0);

        //rect1:
        String parse1 = size1 + "";
        rect(sq1x, sq1Y, Float.parseFloat(parse1), Float.parseFloat(parse1));

        //rect2:
        String parse2 = size2 + "";
        rect(sq2x, sq2Y, Float.parseFloat(parse2), Float.parseFloat(parse2));

    }

    public void moveSquares() {
        //rectangle 1:
        sq1Y += speed1;
        sq1x -= speed1;
        size1 += addSize1;

        //rectangle2:
        sq2Y += speed2;
        sq2x += speed2;
        size2 += addSize2;
    }

    public void addSquares() {
        //debug tool
        //System.out.println();

        //rectangle 1:
        if (sq1Y + size1 > 800) {
            sq1x = 670;
            sq1Y = 460;
            size1 = 7;
        }

        if (sq2Y + size2 > 800) {
            sq2x = 690;
            sq2Y = 460;
            size2 = 7;
        }
    }
}
