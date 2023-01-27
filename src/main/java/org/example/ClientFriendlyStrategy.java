package org.example;

public class ClientFriendlyStrategy extends DiscountStrategy{

@Override
public void use(OrderBase order) {
    int depth = order.countNexts();

    for(int i=0;i<depth;i++){
        OrderComposite temp=order;
        while (temp!=null){
            if(temp.next instanceof NominalDiscount) temp.moveNextDown();
            temp=((OrderComposite)temp.next);
        }
    }

    for(int i=0;i<depth;i++){
        OrderComposite temp=order;
        while (temp!=null){
            if(temp.next instanceof PercentageConditionalDiscount) temp.moveNextDown();
            temp=((OrderComposite)temp.next);
        }
    }

    for(int i=0;i<depth;i++){
        OrderComposite temp=order;
        while (temp!=null){
            if(temp.next instanceof NominalConditionalDiscount) temp.moveNextDown();
            temp=((OrderComposite)temp.next);
        }
    }

    for(int i=0;i<depth;i++){
        OrderComposite temp=order;
        while (temp!=null){
            if(temp.next instanceof Product) temp.moveNextDown();
            temp=((OrderComposite)temp.next);
        }
    }
}
}
