package layers;

import elements.Neuron;
import functions.OneToOne;

import java.util.Arrays;
import java.util.Random;

public class NeuronLayer extends Layer{
    private Neuron[] neurons;
    private final Random r = new Random();
    public NeuronLayer() {
        super();
    }
    public NeuronLayer(LinkLayer previous, LinkLayer next){
        super(previous,next);
    }
    public NeuronLayer(LinkLayer previous, LinkLayer next, Neuron[] neurons){
        super(previous,next);
        setNeurons(neurons);
        setSize(this.neurons.length);
    }

    public NeuronLayer getNext2() {
        Layer next2 = super.getNext().getNext();
        return (NeuronLayer) next2;
    }

    public void setNeurons(Neuron[] neurons){
        this.neurons = neurons;
        setSize(this.neurons.length);
    }
    public void setNeurons(OneToOne function, int count){
        neurons = new Neuron[count];
        for (Neuron n : neurons) {
            n = new Neuron(function);
        }
        setSize(count);
    }
    public void setNeurons(int count){
        neurons = new Neuron[count];
        for (int i=0;i<count;i++) {
            neurons[i] = new Neuron();
        }
        setSize(count);
    }
    public Neuron get(int index){
        return neurons[index];
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
}
