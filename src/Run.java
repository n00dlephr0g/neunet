import models.CompactFullModel;
import tools.Gadget;

public class Run {
    public static void main(String[] args){
        CompactFullModel dave = new CompactFullModel(256,10,16,3);
        dave.compute(Gadget.rar(256));
    }

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
