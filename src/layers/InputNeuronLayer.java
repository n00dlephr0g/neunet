package layers;

import elements.Neuron;

public class InputNeuronLayer extends NeuronLayer{
    public InputNeuronLayer(){
        super(null,null);
    }
    public InputNeuronLayer(LinkLayer next) {
        super(null, next);
    }
    public void updateValues(double[] values){
        for (int i=0;i<(values.length);i++) {
            get(i).setActivation(values[i]);
        }
    }
}
