
public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode currNode = head;
        ListNode prevNode = dummyHead;
        ListNode nextNode;
        

        if(left == right && head.next == null){
            return head;
        }

        for(int i=1; i<left; i++){
            prevNode = prevNode.next;
        }
        currNode = prevNode.next;
        for(int i=0; i<right-left; i++){
            nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = prevNode.next;
            prevNode.next = nextNode;
        }

        return dummyHead.next;

    }
}
