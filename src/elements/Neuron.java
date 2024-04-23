package elements;

import functions.Function;

public class Neuron {
    private double output;
    private double sum;
    private final Function function;

    public Neuron(Function function) {
        this.function = function;
    }

    public void add(double value){
        this.sum += value;
    }
    public double getOutput() {
        this.output = function.solve(sum);
        return output;
    }
    public double getSum() {
        return sum;
    }
    public void reset(){
        sum = 0;
    }
}
