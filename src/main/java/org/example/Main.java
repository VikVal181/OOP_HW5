package org.example;

import org.example.model.Buyer;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        Buyer h1 = new Buyer("Вася");
        Buyer h2 = new Buyer("Маша");
        Buyer h3 = new Buyer("Петя");
        Buyer h4 = new Buyer("Люся");

        View market1 = new View("Zara");

        market1.acceptToMarket(h1);
        market1.takeInQueue(h1);
        market1.acceptToMarket(h2);
        market1.takeInQueue(h2);
        market1.acceptToMarket(h4);
        market1.makeOrder();
        market1.takeInQueue(h4);
        market1.takeOrder();
//        market1.releaseFromQueue();
        market1.releaseFromMarket(h1);

    }
}