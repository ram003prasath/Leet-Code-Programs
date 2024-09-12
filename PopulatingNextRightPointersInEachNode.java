import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulatingNextRightPointersInEachNode {
    
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node curr = null;
        int size;
        while(!q.isEmpty()){
            size = q.size();
            for(int i=0; i<size; i++){
                curr = q.poll();
                curr.next = q.peek();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            curr.next = null;
        }
        return root;
    }

    public Node solution2(Node root){

        if(root == null) return null;
        Node curNode;
        Node leftMost = root;
        while(leftMost.left != null){
            curNode = leftMost;
            while(curNode != null){
                curNode.left.next = curNode.right;
                if(curNode.next != null){
                    curNode.right.next = curNode.next.left;
                }
                curNode = curNode.next;
            }
            leftMost = leftMost.left;
        }

        return root;
    }
}


