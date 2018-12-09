package image;

public abstract class RasterImage<E> {

    private E[][]element ;

    public int getWidth() {
        return element.length;
    }

    public int getHeight() {
        return element[0].length ;
    }

    protected void setWidth (int width){
        this.element[getWidth()][getHeight()] = element[width][getHeight()];

    }

    protected void setHeight(int height){
        this.element[getWidth()][getHeight()] = element[getWidth()][height];
    }
}
