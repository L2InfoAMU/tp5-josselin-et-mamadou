package image;
import javafx.scene.paint.Color;
import java.util.List;

public class VectorImage implements Image {

    private List<Shape> shapes;
    private Shape[][]image;

    public VectorImage (List<Shape> shapes, int width, int height){
        this.shapes = shapes;
        for(int i = 0 ; i < height ; i++) {
            for (int j = 0; j < width; j++)
                image[j][i] = shapes.;
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return image[x][y].getColor();
    }

    public int getWidth() {
        return image.length;
    }

    public int getHeight() {
        return image[0].length ;
    }

    protected void setWidth (int width){
        this.image[getWidth()][getHeight()] = image[width][getHeight()];

    }

    protected void setHeight(int height){
        this.image[getWidth()][getHeight()] = image[getWidth()][height];
    }
}
