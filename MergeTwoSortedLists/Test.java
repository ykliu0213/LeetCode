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
		l1.showList(l1);
		System.out.print("]  ,  [");
		l2.showList(l2);
		System.out.println("]");
		
		System.out.print("Merge Output : [");
		l1.showList(solution.mergeTwoLists(l1, l2));
		System.out.println("]");
	}
}
