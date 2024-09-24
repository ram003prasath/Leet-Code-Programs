import java.util.PriorityQueue;

class MergeKSortedLists{
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->a.val-b.val);

        for (ListNode node : lists) {
            if(node != null){
                minHeap.add(node);
            }
        }

        ListNode head = new ListNode(0), currNode = head, minNode;
        while(!minHeap.isEmpty()){
            minNode = minHeap.poll();
            currNode.next = minNode;
            currNode = currNode.next;

            if(minNode.next != null){
                minHeap.add(minNode.next);
            }
        }
        return head.next;
    }
}