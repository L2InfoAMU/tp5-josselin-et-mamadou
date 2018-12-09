package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int xLeftCorner;
    private int yLeftCorner;
    private int width;
    private int height;
    public Color[][] rectangle;


    public Rectangle(int x, int y, int width, int height, Color color){
        xLeftCorner = x;
        yLeftCorner = y;
        this.width = width;
        this.height = height;
        for(int i = 0 ; i < height ; i++) {
            for (int j = 0; j < width; j++)
                rectangle[j][i] = color;
        }
    }

    @Override
    public boolean contains(Point point) {
        return xLeftCorner < point.x && point.x <= xLeftCorner + width && yLeftCorner < point.y && point.y <= yLeftCorner + height;
    }

    @Override
    public Color getColor() {
        return rectangle[xLeftCorner][yLeftCorner];
    }
}
