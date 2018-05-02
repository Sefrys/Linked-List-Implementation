package com.sefrys.linkedlist;

/**
 * Created by Ireneusz Zagan on 02.05.18, 16:43
 * Contact: sefrys@gmail.com
 */
public class LinkedList {

    public Link firstLink;

    LinkedList() {
        firstLink = null;
    }

    /**
     * Checks if any links exist in the linked list
     * @return true if empty.
     */
    public boolean isEmpty() {
        return (firstLink == null);
    }

}