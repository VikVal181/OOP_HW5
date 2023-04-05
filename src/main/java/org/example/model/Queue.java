package org.example.model;

import java.util.*;

public class Queue {
    private java.util.Queue<Buyer> buyers = new ArrayDeque<>();

    public void addBuyerInMarket(Buyer buyer) {
        buyers.add(buyer);
    }

    public Buyer getFirstBuyer() {
        return buyers.peek();
    }

    public void removeBuyerFromMaarket() {
        buyers.poll();
    }
}
