package Task_4;

public class Circle implements Shape{

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI*Math.pow(r,2); //3.14 * r * r
    }

    @Override
    public void display() {
        Main.applet.ellipse(Main.applet.width/2, Main.applet.height/2, (float)this.r*2, (float)this.r*2);

    }
}
