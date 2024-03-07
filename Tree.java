public class Tree {
    private int value;
    private Tree left;
    private Tree right;
    private String color;

    public Tree(int value){
        this.value = value;
        this.color = null;
    }

    public Tree(int value, Tree left, Tree right){
        this.value=value;
        this.left=left;
        this.right=right;
        this.color=null;
    }

    public void push(int value){
        Tree tree = new Tree(value);
        tree.setColor("Red");
        if(value<this.value){
            if(left==null){
                left = tree;
            }else{
                left.push(value);
            }
        }
        else if(value>this.value){
            if(right==null){
                right=tree;
            }else{
                right.push(value);
            }
        }
        /*System.out.println("Sin balancear:");
        visualLevelOrder();
        System.out.println("Balanceado");
        balance();
        visualLevelOrder();*/
    }
    
    public void preorderLeft(){ 

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
            left.preorderRight();
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
        if(right!=null){
            right.postorderRight();
        }
        if(left!=null){
            left.postorderRight();
        }
        System.out.print(value + ", ");
    }

    public void inorderLeft(){
        if(left!=null){
            left.inorderLeft();
        }
        System.out.print(value+", ");
        if(right!=null){
            right.inorderLeft();
        }
        
    }

    public void inorderRight(){
        if(right!=null){
            right.inorderRight();
        }
        System.out.print(value+", ");
        if(left!=null){
            left.inorderRight();
        }
    }

    public void balance(){
        Tree tree = new Tree(value,left,right);
        if(isRed(tree.getRight()) && !isRed(tree.getLeft())){
            tree = leftRotate(tree);
        }
        if(tree.getLeft() != null&&isRed(tree.getLeft()) && !isRed(tree.getLeft().getLeft())){
            tree = rightRotate(tree);
        }
        if(isRed(tree.getLeft())&&isRed(tree.getRight())){
            colorFlip(tree);
        }
    }

    public Tree leftRotate(Tree tree){
        Tree aux = tree.getRight();
        tree.setRight(aux.getLeft());
        aux.setLeft(tree);
        aux.setColor(tree.getColor());
        tree.setColor("Red");
        return aux;
    }

    public Tree rightRotate(Tree tree){
        Tree aux = tree.getLeft();
        tree.setLeft(aux.getRight());
        aux.setRight(tree);
        aux.setColor(tree.getColor());
        tree.setColor("Red");
        return aux;
    }

    public void colorFlip(Tree tree){
        tree.color="Red";
        if (tree.getLeft() != null) {
            tree.getLeft().setColor(null);
        }
        if (tree.getRight() != null) {
            tree.getRight().setColor(null);
        }
    }

    public boolean isRed(Tree tree){
        return tree == null || "Red".equals(tree.getColor());
    }

    public void visualLevelOrder(){
        int currentLevel = 1;
        int nextLevel = 0;
        Queue queue = new Queue();
        Tree root = new Tree(value,left,right);
        queue.push(root);
        while(!queue.isEmpty()){
            Tree tree = queue.pop();
            currentLevel--;
            System.out.print(tree.getValue());
            if(tree.getLeft()!=null){
                queue.push(tree.getLeft());
                nextLevel++;
            }
            if(tree.getRight()!=null){
                queue.push(tree.getRight());
                nextLevel++;
            }
            if(currentLevel==0){
                System.out.println();
                currentLevel=nextLevel;
                nextLevel=0;
            }
        }
        
    }

    public int getValue(){
        return value;
    }
    public Tree getLeft(){
        return left;
    }
    public Tree getRight(){
        return right;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRight(Tree right){
        this.right = right;
    }
    public void setLeft(Tree left){
        this.left = left;
    }
}