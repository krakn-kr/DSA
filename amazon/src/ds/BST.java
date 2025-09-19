package ds;

class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val = val;
    }
}
public class BST {
    int count = 0;
    Node root;
    public BST(){
        this.root = null;
    }
    public boolean search(int val){
        return searchRec(root,val);
    }
    public boolean searchRec(Node root, int val){
        if(root == null) return false;
        if (val == root.val) return true;
        return val < root.val ? searchRec(root.left,val) : searchRec(root.right,val);
    }
    public void add(int val){
        this.root = insert(root,val);
    }

    public Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (val>root.val){
            root.right = insert(root.right,val);
        }
        if(val< root.val){
            root.left = insert(root.left,val);
        }
        return root;
    }
    public void delete(int val){
        deleteRec(root,val);
    }
    public Node deleteRec(Node root,int val){
        if(root == null){
            return root;
        }else {
            if (val>root.val){
                root.right = deleteRec(root.right,val);
            }else if(val< root.val){
                root.left = deleteRec(root.left,val);
            }else{
               if(root.left == null) return root.right;
               if(root.right == null) return root.left;
               System.out.println("count= "+count++);
               Node min = getMinimum(root);
               root.val = min.val;
               root.right =  deleteRec(root.right,min.val);
            }
        }
        return root;

    }
    public Node getMinimum(Node curr){
        curr = curr.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
    public void print(){
        inorder(root);
    }
    public void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
}
class Main{
    public static void main(String[] args) {

        BST bst = new BST();
        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80
        //      60
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40    80

        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);
        bst.delete(50);
        bst.delete(30);
        bst.delete(40);

        // Print inorder traversal of the BST
        bst.print();
        System.out.println(bst.search(20));
    }
}
