package src.HFDPPractice.Chpt2;

import java.util.ArrayList;

public class BroadcastCompany implements Subject, DataFetchable{

    private ArrayList<Observer> observers;
    private int data;

    BroadcastCompany() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        this.observers.add(ob);
    }

    @Override
    public void unRegisterObserver(Observer ob) {
        this.observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : this.observers) {
            ob.update();
        }
    }

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void setData(int data) {
        System.out.println("Welcome to the Broadcast Company.");
        this.data = data;
        this.notifyObserver();
    }
}
