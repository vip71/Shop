package org.example;

public class NominalDiscount extends OrderComposite {
int discount;

NominalDiscount(int discount) {
    this.discount=discount;
}

@Override
public  int countPrice(){
    return next != null && next.countPrice()>discount ? next.countPrice()-discount : 0;
}
}
