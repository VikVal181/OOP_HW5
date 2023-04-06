package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private List<Buyer> actors = new ArrayList<>();

    public Market(String name) {
        this.name = name;
    }

    public void addBuyerToMarket(Buyer buyer) {
        actors.add(buyer);
    }

    public void removeBuyerFromMarket(Buyer buyer) {
        actors.remove(buyer);
    }
}
