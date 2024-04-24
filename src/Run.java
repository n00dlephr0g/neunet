import layers.CompactLayer;
import layers.InputNeuronLayer;
import layers.NeuronLayer;
import layers.OutputNeuronLayer;
import models.FullModel;

import java.util.Arrays;

public class Run {
    public static void main(String[] args){
        CompactLayer inputLayer = new CompactLayer(256);
        inputLayer.updateValues(rar(256));
        int n=0;
        CompactLayer currentLayer = inputLayer;
        while (n<4){
            CompactLayer newLayer = new CompactLayer(10);
            newLayer.updateValues(rar(10));
            currentLayer.linkToRandom(newLayer);
            currentLayer = newLayer;
            n++;
        }
        CompactLayer result = inputLayer.propagate();
        System.out.println(result);
    }
    public static double[] rar(int size){
        double[] array = new double[200];
        Arrays.setAll(array, i -> Math.random());
        return array;
        /*
        InputNeuronLayer a = new InputNeuronLayer();
        OutputNeuronLayer b = new OutputNeuronLayer();
        a.setNeurons(200);
        a.get(1);
        b.setNeurons(1);
        FullModel model = new FullModel(a,b);
        NeuronLayer c = new NeuronLayer();
        c.setNeurons(10);
        for (int i=0; i<5;i++)
            model.insertLayer(c,1);
        double[] out = model.compute(array);
        System.out.println(Arrays.toString(a.getNeurons()) +"\n"+Arrays.toString(out));
         */
    }
}
