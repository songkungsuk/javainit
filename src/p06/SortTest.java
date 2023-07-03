package p06;

public class SortTest {
	
	public static void main(String[] args) {
		int[] nums = new int[] {10, 7, 15, 1, 4};
		// 0 - 4
		// 
		int swap = 0;
		for(int i = 0; i<nums.length; i++) {
			int min = nums[i];
			int index = i;
			for(int j = i+1; j<nums.length; j++) {
				if(min > nums[j]) {
					min = nums[j];
					index = j;
				}
			}
			swap = nums[i]; //A -> C
			nums[i] = min; // B -> A
			nums[index] = swap; // C -> B
			
		}
		
		for(int i =0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
	}
}
