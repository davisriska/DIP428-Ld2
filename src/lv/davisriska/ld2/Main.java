package lv.davisriska.ld2;

import lv.davisriska.ld2.polygon.Polygon;
import lv.davisriska.ld2.polygon.Vertex;

public class Main {

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        System.out.println("Empty: " + polygon);

        polygon.add(new Vertex(1, 2));
        polygon.add(new Vertex(3, 10));
        polygon.add(new Vertex(5, 4));
        System.out.println("Triangle: " + polygon);

        polygon.delete(0);
        System.out.println("Segment: " + polygon);

        System.out.println("First vertex: " + polygon.vertex(0));

        System.out.println("Get missing vertex");
        polygon.vertex(5);
    }

}
