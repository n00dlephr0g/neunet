package layers;

public class OutputNeuronLayer extends NeuronLayer{
    public OutputNeuronLayer(){
        super(null,null);
    }
    public OutputNeuronLayer(LinkLayer previous) {
        super(previous, null);
    }

    @Override
    public Layer getNext() {
        return null;
    }

    @Override
    public NeuronLayer getNext2() {
        return null;
    }
}
