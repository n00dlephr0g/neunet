package models;

import elements.*;
import layers.*;

public class FullModel extends Model{
    public FullModel(){}
    private void establishLinks(NeuronLayer layer1, NeuronLayer layer2){
        Link[] links = new Link[];
        LinkLayer linklayer = new LinkLayer(layer1,layer2);
    }
    public void insertLayer(NeuronLayer layer, int index) {
        return;
    }
    public NeuronLayer getNeuronLayer(int index){
        goTo(index);
        return CurrentLayer();
    }
}
