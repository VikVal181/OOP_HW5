package org.example.service;

import org.example.model.Buyer;
import org.example.model.Market;
import org.example.model.Queue;

public class QueueService {
    private Queue queue;

    public QueueService(String name) {
        this.queue = new Queue(name);
    }
    public void addBuyerToQueue(Buyer buyer) {
        queue.addBuyerToQueue(buyer);
    }

    public Buyer getFirstBuyer() {
        return queue.getFirstBuyer();
    }

    public void removeBuyerFromQueue() {
        queue.removeBuyerFromQueue();
    }

    public void buyerMakeOrder() {
        getFirstBuyer().setMakeOrder(true);
    }

    public void buyerTakeOrder() {
        getFirstBuyer().setTakeOrder(true);
        getFirstBuyer().setMakeOrder(false);
    }

}
