public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode curr = head, prev = head;
        int size=1;
        while(curr.next!=null){
            curr = curr.next;
            size++;
        }
        curr = head;
        for(int i=0; i<k%size; i++){
            while(curr.next!=null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            curr.next = head;
            head = curr;
        }
        
        return head;
    }
}
