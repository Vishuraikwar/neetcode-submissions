/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        // start , curr1 and curr2 and ek khtm hogyi toh fir jo bhi linked list bchi hae usse continue kr do
        ListNode dummy = new ListNode(-1);
        ListNode pnt = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode next1, next2;

        while(curr1 != null && curr2 != null){
            next1 = curr1.next;
            next2 = curr2.next;

            if(curr1.val <= curr2.val){
                pnt.next = curr1;
                pnt = pnt.next;
                curr1 = curr1.next;
            }else{
                pnt.next = curr2;
                pnt = pnt.next;
                curr2 = curr2.next;
            }
        }

        if(curr1 != null){
            pnt.next = curr1;
        }else{
            pnt.next = curr2;
        }

        return dummy.next;
        
    }
}