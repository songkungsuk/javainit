package p09;

public class SortTest {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 1;
		nums[2] = 35;
		nums[3] = 17;
		nums[4] = 4;
		int tmp;
//		----------------------------1번
		if(nums[0] > nums[1]) {
			
			tmp = nums[1];
			nums[1] = nums[0];
			nums[0] = tmp;
		}
		if(nums[0] > nums[2]) {
			
			tmp = nums[2];
			nums[2] = nums[0];
			nums[0] = tmp;
		}
		if(nums[0] > nums[3]) {
			
			tmp = nums[3];
			nums[3] = nums[0];
			nums[0] = tmp;
		}
		if(nums[0] > nums[4]) {
			
			tmp = nums[4];
			nums[4] = nums[0];
			nums[0] = tmp;
		}
//		--------------------------2번-----------
		if(nums[1] > nums[2]) {
			
			tmp = nums[2];
			nums[2] = nums[1];
			nums[1] = tmp;
		}
		if(nums[1] > nums[3]) {
			
			tmp = nums[3];
			nums[3] = nums[2];
			nums[2] = tmp;
		}
		if(nums[1] > nums[4]) {
			
			tmp = nums[4];
			nums[4] = nums[1];
			nums[1] = tmp;
		}
//	-----------------------3번-----------------------------
		if(nums[2] > nums[3]) {
			
			tmp = nums[3];
			nums[3] = nums[2];
			nums[2] = tmp;
		}
		if(nums[2] > nums[4]) {
			
			tmp = nums[4];
			nums[4] = nums[2];
			nums[2] = tmp;
		}
//		--------------------4번-------------
		if(nums[3] > nums[4]) {
			
			tmp = nums[4];
			nums[4] = nums[3];
			nums[3] = tmp;
		}
		
		
		
	
		System.out.println(nums[0]+ " " + nums[1]+ " " + nums[2] + " " +nums[3]+ " " + nums[4] + " ");
	}
}
