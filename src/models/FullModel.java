package models;

import elements.*;
import layers.*;

public class FullModel extends Model{
    public FullModel(){}
    private void establishLinks(NeuronLayer layer1, NeuronLayer layer2){
        int count = layer1.size();
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
            }
        }
        linklayer.setLinks(links);
    }
    public void insertLayer(NeuronLayer layer, int index) {
        return;
    }
    public NeuronLayer getNeuronLayer(int index){
        goTo(index);
        return CurrentLayer();
    }
}
