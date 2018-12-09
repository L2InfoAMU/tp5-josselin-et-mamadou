package image;
import javafx.scene.paint.Color;
import java.util.List;

public class VectorImage implements Image {

    private List<Shape> shapes;


    public VectorImage (List<Shape> shapes, int width, int height){
        this.shapes = shapes;

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    protected int setWidth(int width){

    }

    protected int setHeight(int height){

    }
}
