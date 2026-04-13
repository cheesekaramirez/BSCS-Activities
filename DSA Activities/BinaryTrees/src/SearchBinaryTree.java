package BinaryTrees.src;

public class SearchBinaryTree 
{
    public static class Node 
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public Node root;
    public static boolean flag=false;
    public SearchBinaryTree()
    {
        root=null;
    }

    public void searchNode(Node temp, int value)
    {
        if(root==null)
        {
            System.out.println("Tree is empty.");
        } else {
            if(temp.data==value)
            {
                flag=true;
                return;
            }

            if(flag==false && temp.right!=null)
            {
                
            }
        }
    }
}
