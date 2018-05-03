package com.sefrys.linkedlist;

/**
 * Created by Ireneusz Zagan on 03.05.18, 16:44
 * Contact: sefrys@gmail.com
 */
public class DoubleLinkedList {

    Link firstLink;
    Link lastLink;

    public void insertInFirstPosition(String address, String owner) {

        Link newLink = new Link("Pułaskiego", "Irek");

        if(isEmpty()) {

            lastLink = firstLink;

        }

        newLink.next = firstLink;
        firstLink = newLink;

    }


    public void insertInLastPosition(String address, String owner) {

    }

    public void insertAfterKey(String address, String owner, int key) {

    }

    public boolean isEmpty() {

        return(firstLink == null);

    }

}
