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
        for(int i = 0 ; i < height ; i++) {
            for (int j = 0 ; j < width ; j++)
                indexesOfColors[j][i] = palette.indexOf(color);
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        createRepresentation();
        for(int i = 0 ; i < pixels.length ; i++){
            for(int j = 0 ; j < pixels[0].length ; j++) {
                if (!palette.contains(getPixelColor(j,i)))
                    palette.add(pixels[j][i]);
                indexesOfColors[j][i]=palette.indexOf(pixels[j][i]);
            }
        }

    }

    public void createRepresentation(){
        int[][] indexesOfColors = new int[getWidth()][getHeight()];
        List<Color> palette = new ArrayList<>();

    }

    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);

    }

    public void setPixelsColor(Color [][] pixels){
        for(int i = 0 ; i < pixels.length ; i++){
            for(int j = 0 ; j < pixels[0].length ; j++) {
                if (!palette.contains(pixels[j][i]))
                    palette.add(pixels[j][i]);
                indexesOfColors[j][i]=palette.indexOf(pixels[j][i]);
            }
        }
    }

    public void setPixelsColor(Color color){
        createRepresentation();
        palette.add(color);
        for(int i = 0 ; i < getHeight() ; i++) {
            for (int j = 0 ; j < getWidth() ; j++)
                indexesOfColors[j][i] = palette.indexOf(color);
        }
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
