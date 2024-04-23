package layers;

import elements.Neuron;

public class InputNeuronLayer extends NeuronLayer{
    public InputNeuronLayer(LinkLayer next) {
        super(null, next);
    }
}
