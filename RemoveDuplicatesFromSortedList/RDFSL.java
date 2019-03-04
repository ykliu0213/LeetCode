package RemoveDuplicatesFromSortedList;

public class RDFSL {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode keep = head;
		while (keep != null && keep.next != null) {
			if (keep.val == keep.next.val)
				keep.next = keep.next.next;
			else
				keep = keep.next;
		}
		return head;
	}
}
