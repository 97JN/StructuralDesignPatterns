package org.example.decorator;

import org.example.component.Component;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Operacja dekoratora przed operacją w komponencie");
        super.operation();
        System.out.println("Operacja dekoratora po operacji w komponencie");
    }
}
