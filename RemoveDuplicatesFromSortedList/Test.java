package RemoveDuplicatesFromSortedList;

public class Test {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		
		RDFSL solution = new RDFSL();
		System.out.print("Given input : [");
		showList(head);
		System.out.println("]");
		
		System.out.print("Output : [");
		showList(solution.deleteDuplicates(head));
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
