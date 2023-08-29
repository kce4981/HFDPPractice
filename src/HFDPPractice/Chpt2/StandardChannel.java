package src.HFDPPractice.Chpt2;

public abstract class StandardChannel implements Observer{

    protected Subject subject;

    @Override
    public void subscribe(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void unSubscribe() {
        this.subject.unRegisterObserver(this);
        this.subject = null;
    }

}
