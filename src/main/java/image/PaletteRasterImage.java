package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image{

    private int[][]indexesOfColors;
    private List <Color> palette;


    public PaletteRasterImage(Color color, int width, int height) {
        createRepresentation();
        palette.add(color);
        for(int i = 0 ; i < height;i++) {
            for (int j = 0; j < width; j++)
                indexesOfColors[j][i] = palette.indexOf(color);
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        createRepresentation();

        for(int i =0 ; i < pixels.length ; i++){
            for(int j = 0 ; j < pixels[0].length ; j++)
                if(!palette.contains(indexesOfColors[j][i]))
                    palette.add(pixels[i][j]);
        }

    }

    public void createRepresentation(){
        int[][] indexesOfColors = new int[getWidth()][getHeight()];
        List<Color> palette = new ArrayList<>();

    }

    public void setPixelColor(Color color, int x, int y){
        //int indexeOfColorPalette = getIndexOfColor(color);

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
        return palette.get(indexesOfColors[x][y]);
    }

    @Override
    public int getWidth() {
        return indexesOfColors[0].length;
    }

    @Override
    public int getHeight() {
        return indexesOfColors.length;
    }

    protected void setWidth(int width){
        this.indexesOfColors[getWidth()][getHeight()]= indexesOfColors[width][getHeight()];
    }

    protected void setHeight(int height){

        this.indexesOfColors[getWidth()][getHeight()] = indexesOfColors[getWidth()][height];
    }
}
