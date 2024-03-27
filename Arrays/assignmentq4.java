import java.util.*;
public class assignmentq4 {
    public static int trappedwater(int height[]) {
        int n=height.length;
        //calculation of left max boundry array 
        int leftmax[] =new int [n];
        leftmax[0] = height[0];
        for (int i=1; i<n; i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }

        //calculation of right max boundry 
        int rightmax[]= new int [n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2; i>=0; i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);

        }

        // loop


        int watertrapped=0;
        for (int i=0; i<n; i++){
            //calculation of water level
            int waterlevel =Math.min(leftmax[i], rightmax[i]);
            watertrapped += waterlevel-height[i];
        }

        return watertrapped;
    }
    public static void  main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bar :");
        int n= sc.nextInt();
        int height[]= new int [n];

        System.out.println("Enter the heights of bar :");
        for (int i=0; i<n; i++){
            height[i]=sc.nextInt();
        }

       // int height[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedwater(height));
        sc.close();
    }
    
}
