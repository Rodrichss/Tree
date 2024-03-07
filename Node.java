public class Node {
    private Tree tree;
    private Node head, tail, next;

    public Node(Tree tree){
        this.tree = tree;
        this.next = next;
        this.head = null;
        this.tail = null;
    }

    public Tree getTree(){
        return this.tree;
    }
    public void setValue(Tree tree){
        this.tree = tree;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getHead(){
        return this.head;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public Node getTail(){
        return this.tail;
    }
    public void setTail(Node tail){
        this.tail = tail;
    }
}