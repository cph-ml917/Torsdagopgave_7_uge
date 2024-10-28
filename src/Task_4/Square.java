package Task_4;

public class Square implements Shape{
    double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        return l*l;
    }

    @Override
    public void display() {

    }
}

