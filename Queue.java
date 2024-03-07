public class Queue {
    private Node head, tail;
    private Tree tree;

    public Queue(){
        this.tree = null;
        this.head = null;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    public void push(Tree tree){
        this.tree = tree;
        Node node = new Node(tree);
        if(head==null){
            head = node;
            tail = node;
        }else{
            Node aux = head;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(node);
            tail = node;
        }
        
    }

    public Tree pop(){
        if(head==null){
            return null;
        }else if(head.getNext() == null){
            Tree current = head.getTree();
            //System.out.println( "Elemento eliminado: "+ head.getTree());
            head = null;
            tail = null;
            return current;
        }else{
            Node aux = head;
            Tree current = aux.getTree();
            //System.out.println("Elemento eliminado: "+ aux.getTree());
            head = head.getNext();
            aux.setNext(null);
            return current;
        }
        
    }

    /*public void show(){
        if(head==null){
            System.out.println("No hay elementos");
        }else{
            Node aux = head;
            while (aux!=null){
                System.out.print(aux.getValue()+" ");
                aux = aux.getNext();
            }
        }
        System.out.println();
    }*/
}