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

        } else {

            firstLink.previous = newLink;

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

        newLink.previous = lastLink;

    }

    public boolean insertAfterKey(String address, String owner, int key) {

        Link newLink = new Link(address, owner);

        Link currentLink = firstLink;

        while(!currentLink.owner.equals(owner)) {

            currentLink = currentLink.next;

            if(currentLink == null) return false;

        }

        if(currentLink == lastLink)  {

            newLink.next = null;
            lastLink = newLink;

        } else {

            newLink.next = currentLink.next;
            currentLink.next.previous = newLink;

        }

        newLink.previous = currentLink;
        currentLink.next = newLink;
        return true;

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
