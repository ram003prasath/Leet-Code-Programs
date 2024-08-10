
public class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;

        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                currNode.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                currNode.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            currNode = currNode.next;
        }

        while(list1!=null){
            currNode.next = new ListNode(list1.val);
            list1 = list1.next;
            currNode = currNode.next;
        }

        while(list2!=null){
            currNode.next = new ListNode(list2.val);
            list2 = list2.next;
            currNode = currNode.next;
        }

        return dummyHead.next;

    }
}
