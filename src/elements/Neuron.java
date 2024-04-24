package elements;

import functions.OneToOne;
import functions.Sigmoid;

public class Neuron {
    private double activation = 0;
    private OneToOne function = new Sigmoid();
    public Neuron(OneToOne function) {
        this.function = function;
    }
    public Neuron() {
    }
    public void add(double value){
        this.activation += value;
    }
    public void activate(double value){
        activation = value;
    }
    public double output() {
        return function.solve(activation);
    }
    public void reset(){
        activation = 0;
    }
    @Override
    public String toString() {
        return activation +"";
    }
}
