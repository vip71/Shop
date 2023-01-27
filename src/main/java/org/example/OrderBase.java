package org.example;

public class OrderBase extends OrderComposite {

    DiscountStrategy discountStrategy;

    @Override
    public  int countPrice() {
        if(discountStrategy!= null)discountStrategy.use(this);
        return next.countPrice();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
