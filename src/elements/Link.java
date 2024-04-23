package elements;

public class Link {
    private double weight;
    private final Neuron start;
    private final Neuron end;
    public Link(Neuron start, Neuron end, double weight){
        this.weight = weight;
        this.start = start;
        this.end = end;
    }
    public void update(){
        double input = start.getOutput();
        double output = input * weight;
        end.add(output);
    }
    public void setWeight(double value){
        this.weight = value;
    }
}
