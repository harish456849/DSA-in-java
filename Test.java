import java.util.*;
class Test{
    public static void main(String[] args) {
        BinaryTree tree = new  BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the tree: ");
        int s = sc.nextInt();
        System.out.println("Enter the Elements: ");
        for(int i=0;i<s;i++)
        {
            int data = sc.nextInt();
            tree.insert(data);
        }
        tree.inOrder();
    }
}