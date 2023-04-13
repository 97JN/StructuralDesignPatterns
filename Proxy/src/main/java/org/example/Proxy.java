package org.example;

public class Proxy implements Object{
    private RealObject realObject;

    @Override
    public void doSomething() {
        if(realObject == null){
            realObject = new RealObject();
        }
        realObject.doSomething();
    }
}
