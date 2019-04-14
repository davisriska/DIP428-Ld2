package lv.davisriska.ld2.polygon.tests;

import lv.davisriska.ld2.polygon.Polygon;
import lv.davisriska.ld2.polygon.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    public void testLd2Task2() {
        Polygon polygon = new Polygon();
        assertEquals("Empty: Empty polygon", "Empty: " + polygon.toString());

        polygon.add(new Vertex(1, 2));
        polygon.add(new Vertex(3, 10));
        polygon.add(new Vertex(5, 4));
        assertEquals("Triangle: (1, 2) (3, 10) (5, 4)", "Triangle: " + polygon.toString());

        polygon.delete(0);
        assertEquals("Segment: (3, 10) (5, 4)", "Segment: " + polygon.toString());

        assertEquals("First vertex: (3, 10)", "First vertex: " + polygon.vertex(0).toString());

        assertThrows(IndexOutOfBoundsException.class, () -> polygon.vertex(5));
    }

}