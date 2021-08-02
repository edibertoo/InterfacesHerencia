package interfaces;

public class Circle implements Polygon {

    private int sides=1;
    public int radio;

    public Circle(int radio){
        this.radio=radio;
    }

    @Override
    public float getArea() {
        return (float) (3.1416*Math.pow(radio,2));
    }

    @Override
    public int getSides() {
        return sides;
    }
}
