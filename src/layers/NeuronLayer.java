package layers;

import elements.Neuron;

public class NeuronLayer extends Layer{
    private Neuron[] neurons;
    public NeuronLayer(LinkLayer previous, LinkLayer next){
        super(previous,next);
    }
    public NeuronLayer(LinkLayer previous, LinkLayer next, Neuron[] neurons){
        super(previous,next);
        setNeurons(neurons);
    }
    public void setNeurons(Neuron[] neurons){
        this.neurons = neurons;
        setSize(this.neurons.length);
    }
    public Neuron getNeuron(int index){
        return neurons[index];
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
}
