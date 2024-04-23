package models;

import elements.*;
import layers.*;

public abstract class Model {
    private InputNeuronLayer inputLayer;
    private OutputNeuronLayer outputLayer;
    private NeuronLayer currentLayer;
    private int size = 0;
    void goTo(int index){
        if (index<size & index>0) {
                currentLayer = inputLayer;
            for (int i = 0; i < index; i++) {
                currentLayer = (NeuronLayer) currentLayer.getNext().getNext();
            }
        }
    }
    public NeuronLayer CurrentLayer(){
        return currentLayer;
    }
    public NeuronLayer getNext(){
        currentLayer = (NeuronLayer) this.currentLayer.getNext().getNext();
        return this.currentLayer;
    }
    public void setInputLayer(InputNeuronLayer inputLayer) {
        this.inputLayer = inputLayer;
        size+=1;
    }
    public void setOutputLayer(OutputNeuronLayer outputLayer) {
        this.outputLayer = outputLayer;
        size+=1;
    }
    public int size() {
        return size;
    }
}
