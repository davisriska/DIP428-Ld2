package lv.davisriska.ld2.list.tests;

import lv.davisriska.ld2.list.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    public void testAddOneItem() {
        List list = new List<Integer>();
        list.add(3);
        assertEquals(3, list.get(0));
    }

    @Test
    public void testAddSecondItem() {
        List list = new List<Integer>();
        list.add(3);
        list.add(5);
        assertEquals(5, list.get(1));
    }

    @Test
    public void testFirstItemRemainsAfterAddingSecond() {
        List list = new List<Integer>();
        list.add(3);
        list.add(5);
        assertEquals(3, list.get(0));
    }

}