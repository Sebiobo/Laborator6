package ACalculator;

public class DoubleCalculator extends Acalculator{

    protected double state;


    public DoubleCalculator(double nr) {
        this.state = nr;
    }

    public DoubleCalculator add(double a) {
        this.state += a;
        return this;
    }

    public DoubleCalculator subtract(double a) {
        this.state -= a;
        return this;
    }

    public DoubleCalculator multiply(double a) {
        this.state *= a;
        return this;
    }

    @Override
    public Object result() {
        return this.state;  // Returnează state ca obiect
    }

    @Override
    protected void init() {
        this.state = 0.0;  // Inițializează state cu o valoare default
    }
}
