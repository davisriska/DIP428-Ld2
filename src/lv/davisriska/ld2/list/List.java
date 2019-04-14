package lv.davisriska.ld2.list;

public class List<Type> {

    private Element<Type> element;
    private int length;

    public List() {
        this.element = null;
        this.length = 0;
    }

    public void add(Type value) {

        this.length++;

        Element<Type> element = new Element<>(value);

        if (this.element == null) {
            this.element = element;
        } else {
            Element<Type> currentElement = this.element;

            while (currentElement.nextElement() != null) {
                currentElement = currentElement.nextElement();
            }

            currentElement.nextElement(element);
        }
    }

    public void delete(int index) {

        if (index < 0 || index > this.length) {
            throw new IndexOutOfBoundsException();
        }

        this.length--;

        if (index == 0) {
            this.element = this.element.nextElement();
        } else {
            Element<Type> currentElement = this.element.nextElement();

            for (int i = 0; i < (index - 1); i++) {
                currentElement = currentElement.nextElement();
            }

            currentElement.nextElement(currentElement.nextElement().nextElement());
        }
    }

    public Type get(int index) {

        if (index < 0 || index > this.length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return this.element.value();
        }

        Element<Type> currentElement = this.element;

        for (int i = 0; i < index; i++) {
            currentElement = currentElement.nextElement();
        }

        return currentElement.value();
    }

    public int length() {
        return this.length;
    }

}
