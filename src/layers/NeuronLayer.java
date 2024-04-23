package layers;

import elements.Neuron;

public class NeuronLayer extends Layer{
    private Neuron[] neurons;
    public NeuronLayer(LinkLayer previous, LinkLayer next){
        super(previous,next);
    }
    public NeuronLayer(LinkLayer previous, LinkLayer next, Neuron[] neurons){
        super(previous,next);
        this.neurons = neurons;
    }
    public void setNeurons(Neuron[] neurons){
        this.neurons = neurons;
    }
    public Neuron getNeuron(int index){
        return neurons[index];
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
}
