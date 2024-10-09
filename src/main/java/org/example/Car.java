package org.example;

public class Car {
    IEngine engine;
    public void setEngine(IEngine engine)
    {
        this.engine = engine;
    }
    void drive()
    {
        int start =engine.start();
        if(start>0)
        {
            System.out.println("car started ....");
        }
        else{
            System.out.println("car not started .....");
        }
    }

}
