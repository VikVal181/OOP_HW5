package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private List<Buyer> actors = new ArrayList<>();

    public Market(String name) {
        this.name = name;
    }

    public void addBuyerInMarket(Buyer buyer) {
        actors.add(buyer);
    }

    public void removeBuyerFromMaarket(Buyer buyer) {
        actors.remove(buyer);
    }
}
