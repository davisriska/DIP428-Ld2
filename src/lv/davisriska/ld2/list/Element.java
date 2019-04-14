package lv.davisriska.ld2.list;

public class Element<Type> {

    private Type value;

    private Element<Type> nextElement;

    public Element() {

    }

    public Element(Type value) {
        this.value = value;
    }

    public Element(Type value, Element<Type> nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }

    public Element<Type> nextElement() {
        return this.nextElement;
    }

    public void nextElement(Element<Type> element) {
        this.nextElement = element;
    }

    public Type value() {
        return this.value;
    }

    public void value(Type value) {
        this.value = value;
    }

}
