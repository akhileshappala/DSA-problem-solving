// link : https://leetcode.com/problems/merge-in-between-linked-lists/description/?envType=daily-question&envId=2024-03-20

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode listStart = list1;
        for(int i =0;i<a-1;i++){
            listStart = listStart.next;
        }
        ListNode listEnd = listStart;
        for(int i =0;i< b-a+2; i++){
            listEnd = listEnd.next;
        }
        listStart.next = list2;
        while(listStart.next != null){
            listStart = listStart.next;
        }
        listStart.next = listEnd;

        return list1;
    }
    
}
