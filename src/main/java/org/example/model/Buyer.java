package org.example.model;

public class Buyer extends Human {
    protected boolean IsMakeOrder = false;
    protected boolean IsTakeOrder = false;

    public Buyer(String name) {
        super(name);
    }

    public void setMakeOrder(boolean makeOrder) {
        IsMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        IsTakeOrder = takeOrder;
    }

    public boolean isMakeOrder() {
        return IsMakeOrder;
    }

    public boolean isTakeOrder() {
        return IsTakeOrder;
    }
}
