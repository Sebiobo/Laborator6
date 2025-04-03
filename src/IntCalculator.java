public class IntCalculator {
    protected int nr;

    protected IntCalculator(int nr) {
        this.nr = nr;
    }

    public  IntCalculator add(int a){
        this.nr += a;
        return this;
    }
    public IntCalculator subtract(int a){
        this.nr -= a;
        return this;
    }
    public IntCalculator multiply(int a){
        this.nr *= a;
        return this;
    }

    public int result(){
        return this.nr;
    }
}
