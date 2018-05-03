package com.sefrys.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ireneusz Zagan on 02.05.18, 17:16
 * Contact: sefrys@gmail.com
 */
class SingleLinkedListTest {

    @Test
    void testHead() {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirstLink("Pułaskiego", "Irek");
        list.insertFirstLink("Dalsroa", "Wenche");
        list.insertFirstLink("Grota Roweckiego", "Sebastian");

        assertEquals("Grota Roweckiego", list.firstLink.address);
    }

//    @Test
//    void testTail() {
//        SingleLinkedList list = new SingleLinkedList();
//        list.insertFirstLink("Pułaskiego", "Irek");
//        list.insertFirstLink("Dalsroa", "Wenche");
//        list.insertFirstLink("Grota Roweckiego", "Sebastian");
//
//        assertEquals("Pułaskiego", list.lastLink.address);
//    }

    @Test
    void testIsEmpty() {
        SingleLinkedList list = new SingleLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    void testIfNotEmpty() {
        SingleLinkedList list = new SingleLinkedList();
        assertFalse(!list.isEmpty());
    }


}