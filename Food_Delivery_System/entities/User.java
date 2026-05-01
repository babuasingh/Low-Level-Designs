package Food_Delivery_System.entities;

import Food_Delivery_System.ObserverDesign.OrderObserver;

public abstract class User implements OrderObserver {
    private String id;
    private String name;

    public User(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
