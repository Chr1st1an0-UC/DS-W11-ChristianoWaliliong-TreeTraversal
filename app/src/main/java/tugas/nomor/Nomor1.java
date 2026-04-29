package tugas.nomor;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class nomor1 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        nomor1 tree = new nomor1();

        System.out.print("Leaf nodes: ");
        tree.printLeafNodesBFS(root);
    }

    void printLeafNodesBFS(Node root) {
    if (root == null) return;

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node current = queue.poll();

        if (current.left == null && current.right == null) {
            System.out.print(current.data + " ");
        }

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}
}