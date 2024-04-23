package layers;

import elements.Link;

public class LinkLayer extends Layer{
    private Link[] links;
    public LinkLayer(NeuronLayer previous, NeuronLayer next) {
        super(previous, next);
    }
    public LinkLayer(NeuronLayer previous, NeuronLayer next, Link[] links) {
        super(previous, next);
        this.links = links;
    }
    public void updateLinks(){
        for (Link link : this.links){
            link.update();
        }
    }
    public void setLinks(Link[] links){
        this.links = links;
        setSize(this.links.length);
    }
    public Link[] getLinks() {
        return links;
    }
    public Link getLink(int index){
        return links[index];
    }
}
