package org.example;

public class Product extends OrderComposite {

    int price;

    Product(int price) {
        this.price=price;
    }

    @Override
    public  int countPrice() {
        return next != null ? next.countPrice()+price : price;
    }

}
