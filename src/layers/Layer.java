package layers;

public abstract class Layer {
    private final Layer previous;
    private final Layer next;
    private int size;

    public Layer(Layer previous, Layer next) {
        this.previous = previous;
        this.next = next;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Layer getPrevious() {
        return previous;
    }

    public Layer getNext() {
        return next;
    }
}
