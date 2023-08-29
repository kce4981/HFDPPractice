package src.HFDPPractice.Chpt2;

public interface Subject {
    void registerObserver(Observer ob);
    void unRegisterObserver(Observer ob);
    void notifyObserver();
}
