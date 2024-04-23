package functions;

import static java.lang.Math.exp;

public class Sigmoid implements OneToOne{
    public double solve(double x){
        return 1/(1 + exp(-x));
    }
}
