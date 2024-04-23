import layers.InputNeuronLayer;
import layers.NeuronLayer;
import layers.OutputNeuronLayer;
import models.FullModel;

import java.util.Arrays;

public class Run {
    public static void main(String[] args){
        InputNeuronLayer a = new InputNeuronLayer();
        OutputNeuronLayer b = new OutputNeuronLayer();
        a.setNeurons(10);
        a.get(1);
        b.setNeurons(1);
        FullModel model = new FullModel(a,b);
        NeuronLayer c = new NeuronLayer();
        c.setNeurons(10);
        for (int i=0; i<5;i++)
            model.insertLayer(c,1);
        double[] array = new double[10];
        Arrays.setAll(array, i -> Math.random());
        double[] out = model.compute(array);
        System.out.println(Arrays.toString(array) +"\n"+Arrays.toString(out));
    }
}
