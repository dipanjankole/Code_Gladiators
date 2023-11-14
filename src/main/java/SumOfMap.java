import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfMap {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter size of the array: ");
	      int size = sc.nextInt();
	      int[] array = new int[size];
	      for(int i = 0 ; i < size; i ++) {
	    	  System.out.println("Enter value " + (i+1 )+ " of the array: ");
	    	  array[i]= sc.nextInt();
	      }
	      System.out.println("Enter the required target: ");
	      int target = sc.nextInt();
	      int arr[] = twoSum(array,target);
	      System.out.println("Desired output: " + Arrays.toString(arr));
	      

	}
	
	 public static int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> numMap = new HashMap<>();
         int n = nums.length;

         for (int i = 0; i < n; i++) {
             int complement = target - nums[i];
             if (numMap.containsKey(complement)) {
                 return new int[]{numMap.get(complement), i};
             }
             numMap.put(nums[i], i);
         }

         return new int[]{};
     }

}
