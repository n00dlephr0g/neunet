public class Link {
    private double weight;
    private Neuron start;
    private Neuron end;
    public Link(double weight){
        this.weight = weight;
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
