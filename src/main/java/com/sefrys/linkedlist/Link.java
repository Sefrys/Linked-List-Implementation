package com.sefrys.linkedlist;

/**
 * Created by Ireneusz Zagan on 02.05.18, 16:45
 * Contact: sefrys@gmail.com
 */
class Link {
    String address;
    String owner;

    Link next;
    Link previous;


    Link(String address, String owner) {

        this.address = address;
        this.owner = owner;
    }

    void display() {
        System.out.println("Address and owner: " + address + " " + owner);
    }

    public String toString() {
        return owner + " " + address;
    }
}
