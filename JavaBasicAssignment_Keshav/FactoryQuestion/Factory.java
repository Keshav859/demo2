package FactoryQuestion;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private static Factory _instance;
    private Factory()
    {
        // Private Constructor
    }
    public static Factory getInstance()
    {
        if(_instance == null){
            synchronized (Factory.class) {
                if(_instance == null)
                _instance = new Factory();
            }
        }
        return _instance;
    }

    List<Chair> orderForChairs = new ArrayList<Chair>();
    List<Table> orderForTables = new ArrayList<Table>();
    public void orderChair(int quantity)
    {
       Chair chair = new Chair(quantity);
       orderForChairs.add(chair);
    }

    public void orderTable(int quantity)
    {
        Table table = new Table(quantity);
        orderForTables.add(table);
    }

    public void printCurrentOrders()
    {
        System.out.println("Order for Chairs::");
        for(Chair chair:orderForChairs)
        {
            System.out.println(chair.quantity);
        }
        System.out.println("Order for Tables::");
        for(Table table:orderForTables)
        {
            System.out.println(table.quantity);
        }
    }
}