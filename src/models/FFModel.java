package models;

import elements.Neuron;
import layers.*;

public abstract class FFModel {
    private InputNeuronLayer inputLayer;
    private OutputNeuronLayer outputLayer;

    public FFModel(InputNeuronLayer inputLayer, OutputNeuronLayer outputLayer) {
        this.inputLayer = inputLayer;
        this.outputLayer = outputLayer;
    }

    private int size = 0;
    public NeuronLayer get(int index){
        if (index<size & index>0) {
            NeuronLayer currentLayer =  inputLayer;
            for (int i = 0; i < index; i++) {
                currentLayer = currentLayer.getNext2();
            }
            if (currentLayer.getClass() == NeuronLayer.class)
                return currentLayer;
        }
        return null;
    }
    public void setInputLayer(InputNeuronLayer inputLayer) {
        this.inputLayer = inputLayer;
        size+=1;
    }
    public void setOutputLayer(OutputNeuronLayer outputLayer) {
        this.outputLayer = outputLayer;
        size+=1;
    }
    public void updateLayers(){
        NeuronLayer currentLayer =  inputLayer;
        while (true) {
            LinkLayer currentLinkLayer = (LinkLayer) currentLayer.getNext();
            currentLinkLayer.updateLinks();
            currentLayer = currentLayer.getNext2();
            if (currentLayer == null)
                break;
        }
    }
    public OutputNeuronLayer getOutputLayer() {
        return outputLayer;
    }
    public InputNeuronLayer getInputLayer() {
        return inputLayer;
    }



    public void add(){
        size += 1;
    }
    public int size() {
        return size;
    }
}
