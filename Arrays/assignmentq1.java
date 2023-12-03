import java.util.*;//  code for Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct


public class assignmentq1 {// brute force approach 
    // time comp. == o(n^2)

public static boolean countduplicate(int nums[]){
    for (int i =0; i<nums.length-1; i++){
        for (int j=i+1; j<nums.length; j++){
            if (nums[i]==nums[j]){// to check every element in the array wether reapted or not
                return false;
            }
        }
    }
    return true;
}

public static void main( String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of elements to be stored : ");
    int n=sc.nextInt();
    int nums[] =new int[n];
    System.out.println("Enter the elements of araay: ");
    for (int i=0; i<nums.length; i++){
    nums[i] =sc.nextInt();
    }
    System.out.println(countduplicate(nums));
}
    
}
