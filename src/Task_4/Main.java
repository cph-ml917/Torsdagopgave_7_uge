//----------Task 4: Interface----------//

/*
4.1 Lav et interface, Shape, med metoden double getArea() defineret.

4.2 Lav to klasser, Circle og Square, som implementerer interfacet. Lad de to klasser tage en double som parameter i konstruktøren. Denne double repræsenterer henholdsvis radius og længde på en cirkel og et kvadrat. Metoderne getArea() skal returnere cirklens eller kvadratets areal. Arealet for en cirkel er pi * r² (altså 3,14 * (radius * radius)). Test i en main, at getArea()-metoderne virker som du forventer.

4.3 Lav en klasse ShapeBuilder, som kan holde en samling af Shapes i en ArrayList. Lav en metode addShape(Shape s) som bruges til at tilføje nye Shape-objekter.

4.4 Lav metoden getTotalArea() i klassen ShapeBuilder, som returnerer det samlede areal af alle Shape-objekterne i ArrayListen.
 */

package Task_4;

import processing.core.PApplet;

public class Main extends PApplet {

    public static PApplet applet;

    public void setup() {

        applet = this;
        
        ShapeBuilder sb = new ShapeBuilder();
        Shape sq = new Square(100);
        Shape cir = new Circle(100);

        sb.addShape(sq);
        sb.addShape(cir);

        System.out.println("Square area: "+sq.getArea());
        System.out.println("Circle area: "+cir.getArea());

        System.out.println("TOTAL: "+sb.getTotalArea());
    }

    public void settings() {
        size(700, 900);
    }

    public static void main(String[] args){
        String[] appletArgs = new String[]{"Main"};
        PApplet.main(appletArgs);

    }
}
