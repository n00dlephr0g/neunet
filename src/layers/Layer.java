package layers;

public abstract class Layer {
    private final Layer previous;
    private final Layer next;

    public Layer(Layer previous, Layer next) {
        this.previous = previous;
        this.next = next;
    }
}
