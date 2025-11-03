class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head,temp=head;
        int sz=0;
        while(temp!=null){
            if(sz>n){
                cur=cur.next;
                temp=temp.next;
            }else{
                temp=temp.next;
            }sz++;
        }
          if(sz-n==0){head=head.next;}
        else{
           ListNode next=cur.next;
            cur.next=next.next;}

        return head;
    }
}