class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head ==  null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode first, second, third;
        first = start;
        second = head;
        if(head.next != null){
            third = head.next;
        }else{
            return head;
        }
        
        while(first != null && second != null && third!= null){
            first.next = third;
            second.next = third.next;
            third.next = second;
            
            first = second;
            if(first.next != null){
                second = first.next;
            }else{
                break;
            }
            
            if(second.next != null){
                third = second.next;
            }else{
                break;
            }
        }
        return start.next;
    }
}
