package elements;

import functions.OneToOne;
import functions.Sigmoid;

public class Neuron {
    private double output;
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
    public void setActivation(double value){
        activation = value;
    }
    public double getOutput() {
        this.output = function.solve(activation);
        return output;
    }
    public double activation() {
        return activation;
    }
    public void reset(){
        activation = 0;
    }

    @Override
    public String toString() {
        return activation +"";
    }
}
