import java.util.Stack;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Stack<Node> stack = new Stack<>();
        Node currNode = head, prevNode = null;
        stack.push(currNode);
        while(!stack.empty()){
            currNode = stack.pop();
            if(prevNode != null){
                currNode.prev = prevNode;
                prevNode.next = currNode;
            }
            if(currNode.next != null){
                stack.push(currNode.next);
            }
            if(currNode.child != null){
                stack.push(currNode.child);
            }
            currNode.child = null;
            prevNode = currNode;
        }
        return head;
    }
}
