package elements;

import java.util.Random;

public class Link {
    private double weight;
    private final Neuron start;
    private final Neuron end;
    public Link(Neuron start, Neuron end, double weight){
        this.weight = weight;
        this.start = start;
        this.end = end;
    }
    public Link(Neuron start, Neuron end){
        weight = (new Random().nextDouble())*2 - 1;
        this.start = start;
        this.end = end;
    }
    public void update(){
        double input = start.output();
        double output = input * weight;
        end.add(output);
    }
    public void setWeight(double value){
        this.weight = value;
    }
}
