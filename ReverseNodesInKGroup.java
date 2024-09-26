public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = head;

        while(count < k && currNode != null){
            currNode = currNode.next;
            count++;
        }

        if(count == k){
            count = 0;
            currNode = head;
            while(count < k){
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
                count++;
            }

            if(count == k){
                head.next = reverseKGroup(nextNode, k);
            }
            return prevNode;
        }

        return head;
    }
}
