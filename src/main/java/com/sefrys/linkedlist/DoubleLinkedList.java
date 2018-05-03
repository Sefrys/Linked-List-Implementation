package com.sefrys.linkedlist;

/**
 * Created by Ireneusz Zagan on 03.05.18, 16:44
 * Contact: sefrys@gmail.com
 */
public class DoubleLinkedList {

    Link firstLink;
    Link lastLink;

    public void insertInFirstPosition(String address, String owner) {

        Link newLink = new Link(address, owner);

        if(isEmpty()) {

            lastLink = newLink;

        }

        newLink.next = firstLink;
        firstLink = newLink;

    }

    public void insertInLastPosition(String address, String owner) {

        Link newLink = new Link(address, owner);

        if(isEmpty()) {

            firstLink = newLink;

        } else {

            lastLink.next = newLink;

        }

        lastLink = newLink;

    }

    public void insertAfterKey(String address, String owner, int key) {

    }

    private boolean isEmpty() {

        return(firstLink == null);

    }

    public void display() {

        Link theLink = firstLink;

        while(theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
        }

    }

}
