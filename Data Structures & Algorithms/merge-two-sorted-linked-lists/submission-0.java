class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Check for null lists
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        // Create a dummy node to help with merging
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        // Initialize pointers using your variable names
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode next1, next2;
        
        // Merge the two lists while both pointers are not null
        while (curr1 != null && curr2 != null) {
            // Save the next nodes before re-linking
            next1 = curr1.next;
            next2 = curr2.next;
            
            if (curr1.val <= curr2.val) {
                tail.next = curr1;  // attach curr1
                tail = tail.next;   // move tail pointer
                curr1 = next1;      // advance curr1
            } else {
                tail.next = curr2;  // attach curr2
                tail = tail.next;   // move tail pointer
                curr2 = next2;      // advance curr2
            }
        }
        
        // Attach any remaining nodes from curr1 or curr2
        if (curr1 != null) {
            tail.next = curr1;
        } else if (curr2 != null) {
            tail.next = curr2;
        }
        
        // The merged list starts at dummy.next
        return dummy.next;
    }
}
