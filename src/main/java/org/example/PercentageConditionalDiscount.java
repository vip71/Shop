package org.example;

public class PercentageConditionalDiscount extends OrderComposite {

double multiplayer;

int minimalPrice;

PercentageConditionalDiscount(double multiplayer,int minimalPrice){
    this.multiplayer=multiplayer;
    this.minimalPrice=minimalPrice;
}

@Override
public  int countPrice() {
    return next.countPrice()>=minimalPrice ? ((int)(next.countPrice() * multiplayer)): next.countPrice();
}

}
