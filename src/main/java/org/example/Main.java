package org.example;

public class Main {
public static void main(String[] args) {
    OrderBase order = new OrderBase();
    order.addNext(new Product(10));
    order.addNext(new Product(200));
    order.addNext(new PercentageDiscount(0.8));
    order.addNext(new PercentageConditionalDiscount(0.1,10000));
    order.addNext(new PercentageConditionalDiscount(0.9,200));
    order.addNext(new NominalConditionalDiscount(5,140));
    order.addNext(new NominalDiscount(10));

    order.setDiscountStrategy(new ShopFriendlyStrategy());
    System.out.println("Po zastosowaniu strategi sklepu "+order.countPrice());

    order.setDiscountStrategy(new ClientFriendlyStrategy());
    System.out.println("Po zastosowaniu strategi klienta "+order.countPrice());
}
}