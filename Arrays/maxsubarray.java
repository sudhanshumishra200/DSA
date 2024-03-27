public class maxsubarray {

// bruteforce solution time complexity is o(n^3)
    public static void max_sub_array(int numbers[]){
        //print sub array
        int maxsum =Integer.MIN_VALUE;
        int currsum =0;
        for (int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currsum =0;
                for (int k=start; k<=end; k++){ // print
                    currsum +=numbers[k];
                   
                }
                System.out.println(currsum);
                if (maxsum< currsum){
                    maxsum=currsum;
                }
            }
           
           
           
        }
        System.out.println("maximum sum is "+ maxsum);
    }
    public static void main(String args[]){
        int numbers[]= {2, 4, 6, 8, 10};
        max_sub_array(numbers);
    }

}
    

