
public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree(5);
        tree.push(3);
        tree.push(7);
        tree.push(2);
        tree.push(4);

        tree.preorderLeft();
        tree.preorderRight();
        tree.postorderLeft();
        tree.postorderRight();
        tree.inorderLeft();
        tree.inorderRight();
    }
}
