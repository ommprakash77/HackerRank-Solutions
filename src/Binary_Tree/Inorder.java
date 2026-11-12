package Binary_Tree;

public class Inorder {
    static class Node {
        int data;
        Inorder.Node left;
        Inorder.Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Inorder.Node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Inorder.Node newNodes = new Inorder.Node(nodes[idx]);
            newNodes.left = buildtree(nodes);
            newNodes.right = buildtree(nodes);
            return newNodes;
        }
    }

    public static void Inorder(Inorder.Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Inorder.Binarytree tree = new Inorder.Binarytree();
        Inorder.Node root = tree.buildtree(nodes);
        Inorder(root);

    }
}


