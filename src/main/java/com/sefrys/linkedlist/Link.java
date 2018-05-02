package com.sefrys.linkedlist;

/**
 * Created by Ireneusz Zagan on 02.05.18, 16:45
 * Contact: sefrys@gmail.com
 */
public class Link {
    public String address;
    public String owner;

    public Link next;

    public Link(String address, String owner) {

        this.address = address;
        this.owner = owner;
    }

    public void display() {
        System.out.println("Address and owner: " + address + " " + owner);
    }
}
