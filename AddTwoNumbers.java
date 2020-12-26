class Solution {
    public static int carry;
    public ListNode util(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null)
        {
            return null;
        }
        // if one list is greater than other
        ListNode temp = new ListNode();
        int x = (l1 != null)? l1.val : 0;
        int y = (l2 != null)? l2.val : 0;
        int sum = x + y + carry;
        if(sum >= 10){
            carry = 1;
            sum = sum % 10;
        }else{
            carry = 0;
        }
        temp.val = sum;
        ListNode first = (l1.next != null)? l1 : l1.next = new ListNode(0);
        ListNode second = (l2.next != null)? l2 : l2.next = new ListNode(0);
        temp.next = util(first.next, second.next);
        return temp;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode();
        start = util(l1, l2);
        if(carry == 1){
            ListNode temp = new ListNode(1);
            temp.next = start;
            return temp;
        }
        return start;
    }
}
