package layers;

public abstract class Layer {
    private Layer previous = null;
    private Layer next = null;
    private int size;

    public Layer(Layer previous, Layer next) {
        this.previous = previous;
        this.next = next;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int size(){
        return size;
    }
    public void setPrevious(Layer layer){
        previous = layer;
    }
    public void setNext(Layer layer){
        next = layer;
    }
    public Layer getPrevious() {
        return previous;
    }

    public Layer getNext() {
        return next;
    }
}
