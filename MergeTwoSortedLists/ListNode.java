package MergeTwoSortedLists;

// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public void showList(ListNode l) {
		System.out.print(" " + l.val);
		if (l.next != null) {
			System.out.print(" ,");
			showList(l.next);
		}
	}
	
}
