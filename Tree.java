public class Tree {
    private int value;
    private Tree left;
    private Tree right;

    public Tree(int value){
        this.value = value;
    }


    public void push(int value){
        Tree tree = new Tree(value);
        if(left==null){
            left = tree;
        }
        else if(right==null){
            right = tree;
            
        }
        else if(left.left==null || left.right==null){
            left.push(value);
        }
        else{
            right.push(value);
        }
    }
    
    public void preorderLeft(){ //5,3,7,2,4

        System.out.print(value+", ");

        if(left!=null){
            left.preorderLeft();
        }
        if(right!=null){
            right.preorderLeft();
        }
    }

    public void preorderRight(){
        System.out.print(value + ", ");

        if(right!=null){
            right.preorderRight();
        }
        if(left != null) {
            right.preorderRight();
        }
    }

    public void postorderLeft(){
        if(left!=null){
            left.postorderLeft();
        }
        if(right!=null){
            right.postorderLeft();
        }
        System.out.print(value + ", ");
    }

    public void postorderRight(){
        if(left!=null){
            left.postorderRight();
        }
        if(right!=null){
            right.postorderRight();
        }
        System.out.print(value + ", ");
    }

    public void inorderLeft(){

    }

    public void inorderRight(){

    }
}