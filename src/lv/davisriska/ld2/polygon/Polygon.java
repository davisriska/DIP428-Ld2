package lv.davisriska.ld2.polygon;

import lv.davisriska.ld2.list.List;

public class Polygon {

    private List<Vertex> vertexList;

    public Polygon() {
        this.vertexList = new List<>();
    }

    public void add(Vertex vertex) {
        this.vertexList.add(vertex);
    }

    public void delete(int index) {
        this.vertexList.delete(index);
    }

    public Vertex vertex(int index) {
        return this.vertexList.get(index);
    }

    @Override
    public String toString() {

        if (this.vertexList.length() == 0) {
            return "Empty polygon";
        }

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < this.vertexList.length(); i++) {
            s.append(this.vertexList.get(i));

            if (i < this.vertexList.length() - 1) {
                s.append(" ");
            }
        }

        return s.toString();
    }

}
