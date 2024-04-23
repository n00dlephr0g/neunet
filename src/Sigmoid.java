import static java.lang.Math.exp;

public class Sigmoid extends Function{
    public double solve(double x){
        return 1/(1 + exp(-x));
    }
}
