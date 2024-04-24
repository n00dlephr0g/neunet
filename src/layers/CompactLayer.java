package layers;

import elements.*;

import java.util.Arrays;

public class CompactLayer{
    private Neuron[/*self neurons*/] neurons;
    private Link[/*self neurons*/]/*to*/[/*other Layer neurons*/] links;
    private double bias = 0;
    private int size=0;
    private CompactLayer previous=null;
    private CompactLayer next=null;
    public CompactLayer(int size) {
        this.size = size;
        this.neurons = new Neuron[size];
        for (int i=0;(i<this.size);i++){
            neurons[i]=new Neuron();
        }
    }
    public void updateValues(double[] values){
        System.out.println("updating " + Arrays.toString(neurons));
        for (int i=0;(i< values.length & i<this.size);i++){
            neurons[i].activate(values[i]);
        }
        System.out.println("updated" + Arrays.toString(neurons));
    }
    public void updateValue(double value, int index) {
        neurons[index].activate(value);
    }
    public void linkToRandom(CompactLayer next){
        this.next = next;
        next.setPrevious(this);
        int size2 = next.size();
        this.links = new Link[size][size2];
        for (int self = 0; self<size; self++){
            Neuron from = getNeuron(self);
            for (int other = 0; other<size2;other++) {
                Neuron to = next.getNeuron(other);
                links[self][other] = new Link(from,to);
            }
        }
    }
    public void linkTo(CompactLayer next,double weight){
        this.next = next;
        next.setPrevious(this);
        int size2 = next.size();
        this.links = new Link[size][size2];
        for (int self = 0; self<size; self++){
            Neuron from = getNeuron(self);
            for (int other = 0; other<size2;other++) {
                Neuron to = next.getNeuron(other);
                links[self][other] = new Link(from,to,weight);
            }
        }
    }
    public CompactLayer propagate(){
        if (next != null) {
            int size2 = next.size();
            for (int other = 0; other<size2;other++){
                double sum = bias;
                Neuron to = getNeuron(other);
                for (int self = 0; self<size; self++){
                    Neuron from = getNeuron(self);
                    sum+=from.output();
                }
                to.activate(sum);
            }
            return next.propagate();
        } else {
            return this;
        }
    }
    public Neuron getNeuron(int index) {
        return neurons[index];
    }
    public Link getLink(int from, int to) {
        return links[from][to];
    }
    public void setLinkWeight(int from, int to,double weight) {
        links[from][to].setWeight(weight);
    }
    public int size() {
        return this.size;
    }
    public void setPrevious(CompactLayer previous){
        this.previous = previous;
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
    public double[] toArray() {
        double[] output = new double[size];
        for (int i = 0; i<size; i++) {
            output[i] = neurons[i].output();
        }
        return output;
    }
}
