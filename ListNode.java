
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class addTwoNumbers {
        public ListNode addTwo(ListNode l1, ListNode l2) {
            
            ListNode dummyNode = new ListNode(0),a = l1, b = l2;
            ListNode current = dummyNode;
            int sum = 0, x, y, carry = 0; 

            while( (a!=null) || (b!=null) ){
                x = (a!=null)?a.val:0;
                y = (b!=null)?b.val:0;
                sum = carry + x + y;
                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;

                if(a != null) a = a.next;
                if(b != null) b = b.next;
            }

            if(carry>0){
                current.next = new ListNode(carry);
            }

            return dummyNode.next;
        }
    }