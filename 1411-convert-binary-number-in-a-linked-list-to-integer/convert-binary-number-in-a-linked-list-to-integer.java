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
    public int getDecimalValue(ListNode head) {
        //reverse the list
        ListNode pre=null,next=null,cur=head;
        int power=0,res=0;

        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
                    }
            head=pre;
        while(head!=null){
            int val=head.val;
            res+=Math.pow(2,power)*val;
            power++;
            head=head.next;
        }
        return res;
    }
}