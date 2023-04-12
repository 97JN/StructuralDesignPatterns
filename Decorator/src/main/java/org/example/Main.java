package org.example;

import org.example.component.Component;
import org.example.component.ConcreteComponent;
import org.example.decorator.ConcreteDecorator;
import org.example.decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
       
        decorator.operation();
    }
}