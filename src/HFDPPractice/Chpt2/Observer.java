package src.HFDPPractice.Chpt2;

public interface Observer {

    void subscribe(Subject subject);
    void unSubscribe();
    void update();
}