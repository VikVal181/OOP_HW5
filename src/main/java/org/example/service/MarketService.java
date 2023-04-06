package org.example.service;

import org.example.model.Buyer;
import org.example.model.Market;

public class MarketService {
    private Market market;

    public MarketService(String name) {
        this.market = new Market(name);
    }

    public void addBuyerToMarket(Buyer buyer) {
        market.addBuyerToMarket(buyer);
    }

    public void removeBuyerFromMarket(Buyer buyer) {
        market.removeBuyerFromMarket(buyer);
    }
}
