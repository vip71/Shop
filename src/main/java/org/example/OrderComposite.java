package org.example;

public abstract class OrderComposite implements OrderComponent {
    OrderComponent next;

    public void setNext(OrderComposite next) {
        this.next = next;
    }

    public void addNext(OrderComposite next){
        if (this.next == null) {
            this.next = next;
        } else {
            ((OrderComposite)this.next).addNext(next);
        }
    }

    public void moveNextDown(){
        OrderComposite temp = ((OrderComposite)next);
        next=((OrderComposite)next).next;
        temp.setNext(null);
        addNext(temp);
    }

    void printTree() {
        System.out.println(this);
        if(next!=null && (next instanceof OrderComposite)) ((OrderComposite)next).printTree();
    }

    int countNexts() {
        return next == null || ! (next instanceof OrderComposite) ? 1 : 1 + ((OrderComposite)next).countNexts() ;
    }
}
