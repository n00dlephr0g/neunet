package models;

import elements.*;
import layers.*;
import displays.Display;

public class FullModel extends FFModel {
    private Display display;
    public FullModel(InputNeuronLayer inputLayer, OutputNeuronLayer outputLayer) {
        super(inputLayer, outputLayer);
        establishLinks(inputLayer,outputLayer);
    }
    public double[] compute(double[] input){
        double[] output = new double[getOutputLayer().size()];
        getInputLayer().updateValues(input);
        updateLayers();
        for (int i = 0; i<output.length;i++)
            output[i] = getOutputLayer().get(i).activation();
        return output;
    }
    private void establishLinks(NeuronLayer layer1, NeuronLayer layer2){
        int count = layer1.size()*layer2.size();
        Link[] links = new Link[count];
        LinkLayer linklayer = new LinkLayer(layer1,layer2);
        layer1.setNext(linklayer);
        layer2.setPrevious(linklayer);
        Neuron[] neurons1 = layer1.getNeurons();
        Neuron[] neurons2 = layer2.getNeurons();
        int n = 0;
        for (Neuron n1 : neurons1) {
            for (Neuron n2 : neurons2){
                links[n] = new Link(n1,n2);
                n++;
            }
        }
        linklayer.setLinks(links);
    }
    public void insertLayer(NeuronLayer layer2, int index) {
        NeuronLayer layer1 = get(index);
        NeuronLayer layer3 = layer1.getNext2();
        establishLinks(layer1, layer2);
        establishLinks(layer2,layer3);
        add();
    }
    public void newDisplay(int w, int h){
        display = new Display(w,h);
    }
}
