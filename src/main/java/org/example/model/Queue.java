package org.example.model;

import java.util.*;

public class Queue {
    private String name;
    private java.util.Queue<Buyer> buyers = new ArrayDeque<>();

    public Queue(String name) {
        this.name = name;
    }

    public void addBuyerToQueue(Buyer buyer) {
        buyers.add(buyer);
    }

    public Buyer getFirstBuyer() {
        return buyers.peek();
    }

    public void removeBuyerFromQueue() {
        buyers.poll();
    }
}
