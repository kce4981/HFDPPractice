package src.HFDPPractice.Chpt2;

import java.util.ArrayList;

public class NewsAgent implements Subject, DataFetchable{

    private ArrayList<Observer> observers;
    public int data;

    NewsAgent() {
        this.data = 0;
        this.observers = new ArrayList<Observer>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        System.out.println("Have a wonderful day while enjoying our news channels!");
        this.data = data;
        this.notifyObserver();
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
        for (Observer ob: this.observers) {
            ob.update();
        }
    }
}
