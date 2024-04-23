package elements;

import functions.OneToOne;

public class Neuron {
    private double output;
    private double sum = 0;
    private final OneToOne function;

    public Neuron(OneToOne function) {
        this.function = function;
    }
    public void add(double value){
        this.sum += value;
    }
    public void setSum(double value){
        sum = value;
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
