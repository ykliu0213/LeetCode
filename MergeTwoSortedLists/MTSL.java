package MergeTwoSortedLists;

public class MTSL {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode keep = ans;
        while( l1 != null && l2 != null){
            if(l1.val < l2.val){
                keep.next = l1;
                l1 = l1.next;
            }else{
                keep.next = l2;
                l2 = l2.next;
            }
            keep.next.next = null;
            keep = keep.next;
        }
        
        if( l1 != null ){
            keep.next = l1;
        }else{
            keep.next = l2;
        }
        
        return ans.next;
    }
}
