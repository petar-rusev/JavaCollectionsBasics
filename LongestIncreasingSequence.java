import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		
		try(Scanner input=new Scanner(System.in)){
			String numbers=input.nextLine();
			String[] numArray= numbers.split(" ");
			int [] nums=new int[numArray.length];
			
			for(int i=0;i<numArray.length;i++){
				nums[i]=Integer.parseInt(numArray[i]);
			}
			
			int start=1;
			int Max=1;
			int position=0;
			System.out.print(nums[0]);
			for(int i=1;i<nums.length;i++){
				if(nums[i]>nums[i-1]){
					System.out.print(""+nums[i]);
					start++;
				}
				else{
					start=1;
					System.out.println();
					System.out.print(nums[i]);
				}
				if(start>Max){
					Max=start;
					position=i;
				}
			}
			System.out.println();
			System.out.print("Longest:");
			for(int j=0;j<start;j++){
				
				System.out.print(nums[position - start +1 + j] + " ");
			}
		}

	}

}
