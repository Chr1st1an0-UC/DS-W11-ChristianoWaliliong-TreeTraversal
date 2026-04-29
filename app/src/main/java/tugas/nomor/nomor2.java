package tugas.nomor;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // helper untuk simpan node + depth
    class NodeDepth {
        Node node;
        int depth;

        NodeDepth(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    // BFS dengan batas depth
    public void bfsLimit(int maxDepth) {
        if (root == null) return;

        Queue<NodeDepth> queue = new LinkedList<>();
        queue.add(new NodeDepth(root, 0));

        while (!queue.isEmpty()) {
            NodeDepth current = queue.poll();

            if (current.depth > maxDepth) continue;

            System.out.print(current.node.data + " ");

            if (current.depth < maxDepth) {
                if (current.node.left != null)
                    queue.add(new NodeDepth(current.node.left, current.depth + 1));

                if (current.node.right != null)
                    queue.add(new NodeDepth(current.node.right, current.depth + 1));
            }
        }
    }

    public void printAtDepth(int targetDepth) {
        if (root == null) return;

        Queue<NodeDepth> queue = new LinkedList<>();
        queue.add(new NodeDepth(root, 0));

        while (!queue.isEmpty()) {
            NodeDepth current = queue.poll();

            // kalau sudah di depth target → print
            if (current.depth == targetDepth) {
                System.out.print(current.node.data + " ");
            }

            // kalau masih di bawah target → lanjut
            if (current.depth < targetDepth) {
                if (current.node.left != null)
                    queue.add(new NodeDepth(current.node.left, current.depth + 1));

                if (current.node.right != null)
                    queue.add(new NodeDepth(current.node.right, current.depth + 1));
            }
        }
    }
}

public class nomor2 {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // 🔹 Bangun tree langsung di kode
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.root.right.right = tree.new Node(6);

        int n = 2; // depth limit

        System.out.print("BFS sampai depth " + n + ": ");
        tree.bfsLimit(n);

        System.out.print("\nNode tepat di depth " + n + " : ");
        tree.printAtDepth(n);

    }
}