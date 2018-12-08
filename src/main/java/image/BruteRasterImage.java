package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {

    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        pixels = new Color[width][height];
        for(int i = 0 ; i < height ; i++)
            for (int j = 0; j < width ; j++ )
                pixels[j][i] = color;
    }


    public BruteRasterImage(Color[][] colors){
        pixels = new Color[Matrices.getColumnCount(colors)][Matrices.getRowCount(colors)];
        for (int i = 0 ; i < Matrices.getRowCount(colors) ; i ++) {
            for (int j = 0 ; j < Matrices.getColumnCount(colors) ; j++)
                pixels[j][i] = colors[j][i];
        }
    }

    public void createRepresentation(){
        Color[][] representation = new Color[getWidth()][getHeight()];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        for(int i = 0 ; i < getWidth() ; i++) {
            for (int j = 0; j < getHeight(); j++)
                this.pixels[j][i] = pixels[j][i];
        }
    }

    private void setPixelsColor(Color color){
        for(int i = 0 ; i < getWidth() ; i++) {
            for (int j = 0; j < getHeight(); j++)
                pixels[j][i] = color;
        }
    }

    public int getWidth() {
        return pixels.length;
    }

    public int getHeight() {
        return pixels[0].length ;
    }

    protected void setWidth (int width){
        this.pixels[getWidth()][getHeight()] = pixels[width][getHeight()];

    }

    protected void setHeight(int height){
          this.pixels[getWidth()][getHeight()] = pixels[getWidth()][height];
    }

}
