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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(n==c) return head.next;
        int s=c-n;
        ListNode temp1=head;
        for(int i=1;i<s&&temp1.next!=null;i++)
        {
            temp1=temp1.next;
        }
        if(temp1.next==null) return head;
        temp1.next=temp1.next.next;
        return head;
    }
}