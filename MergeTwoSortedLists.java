class Solution {
    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        if(L1 == null) return L2;
        if(L2 == null) return L1;
        if(L1 == null && L2 == null) return null;
        ListNode globalHead = new ListNode(0);
        ListNode head = globalHead;
        while(L1 != null && L2 != null){
            ListNode temp;
            if(L1.val <= L2.val){
                temp = new ListNode(L1.val);
                L1 = L1.next;
            }else{
                temp = new ListNode(L2.val);
                L2 = L2.next;
            }
            head.next = temp;
            head = head.next;
        }
        
        if(L1 != null && L2 == null){
            while(L1 != null){
                ListNode temp = new ListNode(L1.val);
                head.next = temp;
                head = head.next;
                L1 = L1.next;
            }
        }
        
        if(L2 != null && L1 == null){
            while(L2 != null){
                ListNode temp = new ListNode(L2.val);
                head.next = temp;
                head = head.next;
                L2 = L2.next;
            }
        }
        return globalHead.next;
    }
}
