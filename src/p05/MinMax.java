package p05;

public class MinMax {

	public static void main(String[] args) {
		int [] nums = new int[] {10, 22, 5, 8, 25};
		
		int max = nums[0];
		int max_index = 0;
		for(int i=1; i<nums.length; i++) {
			if(max < nums[i]) { //기존값이 새로운값보다 작으면 기존값을 갱신
				max = nums[i];
				max_index = i;
			}
		}
		
		System.out.println("max : " + max); // max
		System.out.println("max_index : " + max_index); //maxindex
		
		int min = nums[0];
		int min_index = 0;
		for(int i=1; i<nums.length; i++) {
			if(min > nums[i]) { // 기존값이 새로운값보다 크면 새로운 값을 갱신 
				min = nums[i];
				min_index = i;
			}
		}
		System.out.println("min : "+ min); //min
		System.out.println("min_index : "+ min_index); //min index
	}
}
