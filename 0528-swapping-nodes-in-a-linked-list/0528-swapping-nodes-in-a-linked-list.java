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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> arr=ltoa(head);
        int n=arr.size();
        int temp=arr.get(k-1);
        arr.set(k-1,arr.get(n-k));
        arr.set(n-k,temp);
        ListNode h=new ListNode(arr.get(0));
        ListNode curr=h;
        for(int i=1;i<n;i++){
            curr.next=new ListNode(arr.get(i));
            curr=curr.next;
        }
        return h;
    }
    ArrayList<Integer> ltoa(ListNode head){
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        return arr;
    }
}