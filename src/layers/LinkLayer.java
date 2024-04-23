package layers;

import elements.Link;

public class LinkLayer {
    private final LinkLayer previous;
    private final LinkLayer next;
    private Link[] links;
    public LinkLayer(LinkLayer previous, LinkLayer next) {
        this.previous = previous;
        this.next = next;
    }
    public void setLinks(Link[] links){
        this.links = links;
    }
    public Link[] getLinks() {
        return links;
    }
    public Link getLink(int index){
        return links[index];
    }
    public LinkLayer getPrevious() {
        return previous;
    }
    public LinkLayer getNext() {
        return next;
    }
}
