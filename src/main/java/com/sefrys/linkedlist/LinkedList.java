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

    /**
     * Creating a new link, and setting it as first in list.
     */
    public void insertFirstLink(String address, String owner) {
       Link newLink = new Link(address, owner);

       newLink.next = firstLink;

       firstLink = newLink;
    }

    /**
     * Removing the first link and assigning its next link as the first link
     * @return reference to new first link
     */
    public Link removeFirstLink() {
        Link linkReference = firstLink;

        if(!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty linked list");
        }

        return linkReference;
    }

}
