import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {
    PImage background;

    public static void main(String[] args) {
        System.out.println("Welcome to Ball Run! Use space to jump and the left and right arrow keys to move" +
                "horizontally");

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
    }

    public void keyPressed() {

    }

    public void drawBackground() {
        imageMode(CORNER);
        image(background, 0, 0);
        //image(background, 0 + background.width, 0);
    }
}
