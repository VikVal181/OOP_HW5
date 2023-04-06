package org.example.view;

import org.example.model.Buyer;
import org.example.model.Market;
import org.example.service.MarketService;
import org.example.service.QueueService;

public class View {
    private MarketService marketService;
    private QueueService queueService;

    public View(String name) {
        this.marketService = new MarketService(name);
        this.queueService = new QueueService(name);
    }

    public void acceptToMarket(Buyer buyer) {
        marketService.addBuyerToMarket(buyer);
        System.out.println(buyer.getName() + " зашел(a) в магазин");
    }

    public void releaseFromMarket(Buyer buyer) {
        marketService.removeBuyerFromMarket(buyer);
        System.out.println(buyer.getName() + " покинул(a) магазин");
    }
    public void takeInQueue(Buyer buyer) {
        queueService.addBuyerToQueue(buyer);
        System.out.println(buyer.getName() + " встал(a) в очередь");
    }
    public void releaseFromQueue() {
        System.out.println(queueService.getFirstBuyer().getName() + " покинул(a) очередь");
        queueService.removeBuyerFromQueue();
    }
}

