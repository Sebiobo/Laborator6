package ACalculator;

public abstract class Acalculator {

    protected Object state;

    public Object result() {
        return state;
    }

    public Acalculator clear() {
        this.init();
        return this;
    }

    protected abstract void init();
}
