package FactoryQuestion;

public class Main {
    public static void main(String args[])
    {
        Factory instance = Factory.getInstance();
        instance.orderChair(5);
        instance.orderTable(5);
        instance.printCurrentOrders();
    }
}