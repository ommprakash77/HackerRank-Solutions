package Binary_Tree;

public class Postorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree {
        static int idx = -1;

        public static Postorder.Node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Postorder.Node newNodes = new Postorder.Node(nodes[idx]);
            newNodes.left = buildtree(nodes);
            newNodes.right = buildtree(nodes);
            return newNodes;
        }
    }
    public static void Postorder(Postorder.Node root){
        if(root==null){
            return ;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int[]nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Postorder.Binarytree tree=new Postorder.Binarytree();
        Postorder.Node root=tree.buildtree(nodes);
        Postorder(root);

    }
}


