
public class removeNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = 0,index;
        ListNode current = head, prev = head;


        while(current != null){
            size += 1;
            current = current.next;
        }
        if(size==1 && n==1){
            return null;
        }

        index = size - n;
        current = head;

        if(index == 0){
            return head.next;
        }

        for(int i=0; i<index; i++){
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
        return head;
    }
}
