package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image{

    private int[][]indexesOfColors;
    private List <Color> palette;


    public PaletteRasterImage(Color color, int width, int height) {
        indexesOfColors = new int[width][height];
        palette = new ArrayList<>();
        setPixelColor(color, 0, 0);
        for(int i = 0 ; i < height;i++)
            for (int j = 0; j < width; j++ )
                indexesOfColors[j][i]= palette;

    }

    public PaletteRasterImage(Color[][] pixels){
        createRepresentation();
        for(int)

    }

    public void createRepresentation(){
        Color[][] representation = new Color[getWidth()][getHeight()];

    }

    public void setPixelColor(Color color, int x, int y){
        int indexeOfColorPalette = getIndexOfColor(color);
    }

    private void getIndexOfColor(){
        for(int index=0;index<)

    }

    public void setPixelsColor(Color color){
        for int x=0;x<getWidth

                setPixelsColor
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
}
