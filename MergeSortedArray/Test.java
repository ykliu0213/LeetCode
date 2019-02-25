package MergeSortedArray;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = nums1.length - nums2.length , n = nums2.length;
		
		MSA solution = new MSA();
		System.out.println("Given input:");
		System.out.println("nums1 : " + Arrays.toString(nums1));
		System.out.println("m : " + m);
		System.out.println("nums2 : " + Arrays.toString(nums2));
		System.out.println("n : " + n);
		solution.merge(nums1, m, nums2, n);
		System.out.println();
		System.out.println("Output : " + Arrays.toString(nums1));
	}
}
