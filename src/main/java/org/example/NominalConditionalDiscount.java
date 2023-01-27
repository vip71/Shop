package org.example;

public class NominalConditionalDiscount extends OrderComposite {

int discount;

int minimalPrice;

NominalConditionalDiscount(int discount,int minimalPrice){
    this.discount=discount;
    this.minimalPrice=minimalPrice;
}

@Override
public int countPrice() {
    return next.countPrice()>=minimalPrice ? next.countPrice()-discount: next.countPrice();
}
}
