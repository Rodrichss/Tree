
public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree(5);
        int[] valuesToInsert = {3, 7, 2, 4,1};

        for (int value : valuesToInsert) {
            System.out.println("Desbalanceado");
            tree.visualLevelOrder();
            System.out.println("Balanceado");
            tree.visualLevelOrder();
            tree.push(value);
        }
        System.out.println("Desbalanceado");
        tree.visualLevelOrder();
        System.out.println("Balanceado");
        tree.visualLevelOrder();

        System.out.println("preorderLeft");
        tree.preorderLeft();
        System.out.println("\npreorderRight");
        tree.preorderRight();
        System.out.println("\npostorderLeft");
        tree.postorderLeft();
        System.out.println("\npostorderRight");
        tree.postorderRight();
        System.out.println("\ninorderLeft");
        tree.inorderLeft();
        System.out.println("\ninorderRight");
        tree.inorderRight();
        System.out.println("\nlevelOrder");
        tree.visualLevelOrder();
    }
}
