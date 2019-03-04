package MergeTwoSortedLists;

public class Test {
	public static void main(String[] args) {
		MTSL solution = new MTSL();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		System.out.print("Given input : [");
		showList(l1);
		System.out.print("]  ,  [");
		showList(l2);
		System.out.println("]");
		
		System.out.print("Merge Output : [");
		showList(solution.mergeTwoLists(l1, l2));
		System.out.println("]");
	}
	
	public static void showList(ListNode l) {
		System.out.print(" " + l.val);
		if (l.next != null) {
			System.out.print(" ,");
			showList(l.next);
		}
	}
	
}
