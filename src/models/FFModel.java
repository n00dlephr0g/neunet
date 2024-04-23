package models;

import elements.Neuron;
import layers.*;

import java.util.Arrays;

public abstract class FFModel {
    private InputNeuronLayer inputLayer;
    private OutputNeuronLayer outputLayer;
    private int size;
    public FFModel(InputNeuronLayer inputLayer, OutputNeuronLayer outputLayer) {
        this.inputLayer = inputLayer;
        this.outputLayer = outputLayer;
        this.size = 2;
    }

    public NeuronLayer get(int index){
        NeuronLayer currentLayer = inputLayer;
        if (index<=size & index>=0) {
            for (int i = 0; i < index; i++) {
                if (currentLayer.getNext2() != null)
                    currentLayer = currentLayer.getNext2();
            }
        }
        return currentLayer;
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
        LinkLayer currentLinkLayer = (LinkLayer) currentLayer.getNext();
        while (true) {
            currentLinkLayer.updateLinks();
            if (currentLayer.getNext2() == null)
                break;
            else
                currentLayer = currentLayer.getNext2();
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
