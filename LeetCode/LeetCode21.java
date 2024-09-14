package LeetCode;

public class LeetCode21 {
    public static void main(String[] args) {
        //list1 = [1,2,4], list2 = [1,3,4]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(5);

        System.out.println(l1 + "\n" + l2);
        ListNode l3 = Solution.mergeTwoLists(l1,l2);
        System.out.println(l3);
    }
}
/**
 * Definition for singly-linked list.
 *  class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode current = result;
        while(list1 != null && list2 != null) {

                if(list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                }else{
                    current.next = list2;
                    list2 = list2.next;
                }
            current = current.next;
        }
        if(list1 != null) {
            current.next = list1;
        }else if(list2 != null) {
            current.next = list2;
        }
        return result.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(val);
        ListNode pointer = next;
        while(pointer != null) {
            builder.append(",").append(pointer.val);
            pointer = pointer.next;
        }
        builder.append("]");
        return builder.toString();
    }
}