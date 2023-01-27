package org.example;

public class PercentageDiscount extends OrderComposite {
double multiplier;

PercentageDiscount(double multiplier) {
    this.multiplier=multiplier;
}

@Override
public int countPrice(){
    return next != null  ? (((int) (next.countPrice() * multiplier))) : 0;
}
}
