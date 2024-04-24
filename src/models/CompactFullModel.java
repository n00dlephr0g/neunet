package models;

import layers.CompactLayer;
import tools.Gadget;


public class CompactFullModel {
    private CompactLayer inputLayer;
    private int inputSize;
    private CompactLayer outputLayer;
    private int outputSize;
    private int hiddenSize;
    private int hiddenCount;

    public CompactFullModel(int inputSize, int outputSize, int hiddenSize, int hiddenCount) {
        this.inputSize = inputSize;
        this.outputSize = outputSize;
        this.hiddenCount = hiddenCount;
        this.hiddenSize = hiddenSize;
        inputLayer = new CompactLayer(inputSize);
        inputLayer.updateValues(Gadget.rar(inputSize));
        int n=0;

        CompactLayer currentLayer = inputLayer;
        while (n<hiddenCount){
            CompactLayer newLayer = new CompactLayer(hiddenSize);
            newLayer.updateValues(Gadget.rar(hiddenSize));
            currentLayer.linkToRandom(newLayer);
            currentLayer = newLayer;
            n++;
        }
        outputLayer = new CompactLayer(outputSize);
        currentLayer.linkToRandom(outputLayer);
    }
    public double[] compute(double[] inputs) {
        inputLayer.updateValues(inputs);
        return inputLayer.propagate().toArray();
    }
}
