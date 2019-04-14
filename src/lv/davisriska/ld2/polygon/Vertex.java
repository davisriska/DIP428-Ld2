package lv.davisriska.ld2.polygon;

public class Vertex {

    private int x;
    private int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int X() {
        return this.x;
    }

    public int Y() {
        return this.y;
    }

    @Override
    public String toString() {
        return "(" + this.X() + ", " + this.Y() + ")";
    }

}
