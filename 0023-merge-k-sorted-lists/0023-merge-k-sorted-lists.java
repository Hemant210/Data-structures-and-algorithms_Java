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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        // Create minHeap
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add head of each list in the queue first
        for (ListNode list : lists) {
            if (list != null)
                pq.offer(list);
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (!pq.isEmpty()) {
            // Assign next smallest node
            ListNode node = pq.poll();
            prev.next = node;
            prev = prev.next;

            if (node.next != null) {
                pq.offer(node.next); // Offer remaining nodes from same list as we traverse.
            }
        }

        return dummy.next;
    }
}

/**
------------------------------------------------------------------------------------------------------------
Time Complexity:
------------------------------------------------------------------------------------------------------------
Let \U0001d458 be the number of linked lists.
Let \U0001d45b be the total number of nodes across all lists.
Each insertion or removal from the priority queue takes O(logk). 
Since we process each node exactly once: Total operations: O(nlogk)
------------------------------------------------------------------------------------------------------------
Total TC: O(nlogk)
------------------------------------------------------------------------------------------------------------


------------------------------------------------------------------------------------------------------------
Space Complexity:
------------------------------------------------------------------------------------------------------------
The heap stores at most k nodes at a time → \U0001d442(\U0001d458)
Output list uses existing nodes → no extra space for nodes
------------------------------------------------------------------------------------------------------------
Total SC = O(k) (excluding output list)
------------------------------------------------------------------------------------------------------------
*/