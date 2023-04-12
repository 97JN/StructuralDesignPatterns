package org.example;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Operacja w kompozycie: "+name);
        for (Component child: componentList){
            child.operation();
        }
    }

    public void add(Component component){
        componentList.add(component);
    }

    public void remove(Component component){
        componentList.remove(component);
    }

    public void getChild(int index){
        componentList.get(index);
    }


}
