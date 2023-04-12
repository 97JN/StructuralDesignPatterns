package org.example;

public class Main {
    public static void main(String[] args) {
        Leaf l1 = new Leaf("Liść 1");
        Leaf l2 = new Leaf("Liść 2");
        Leaf l3 = new Leaf("Liść 3");

        Composite c1 = new Composite("Kompozyt 1");
        Composite c2 = new Composite("Kompozyt 2");
        Composite c3 = new Composite("Kompozyt 3");

        c3.add(l1);
        c3.add(l2);
        c3.add(l3);

        c1.add(l3);

        c2.add(c3);

        c1.operation();
        System.out.println();
        c2.operation();
        System.out.println();
        c3.operation();
    }
}