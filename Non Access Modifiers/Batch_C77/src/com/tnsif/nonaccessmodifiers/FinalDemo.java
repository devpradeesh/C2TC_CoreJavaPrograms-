package com.tnsif.nonaccessmodifiers; 

class FinalDemo {

    final int Max = 100;

    void display() {
        System.out.println("Show the value of max: " + Max);
    }
}

class Child extends FinalDemo {

    void display() {
        System.out.println("Overridden value: " + Max);
    }
}
