public class maxsubarray2 {
// optimize solution t.c is o(n^2)
    
    public static void sub_array(int numbers[]){
        //print sub array
        int maxsum =Integer.MIN_VALUE;
        int currsum =0;
        int prefix[]= new int [numbers.length];
        prefix[0]= numbers[0];

        //calculate frefix array
        for (int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+numbers[i];


        }


        for (int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currsum = start ==0 ? prefix[end] :prefix[end]- prefix[start-1];
            
                if (maxsum< currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maximum sum is "+ maxsum);
    }
    public static void main(String args[]){
        int numbers[]= {2, 4, 6, 8, 10};
        sub_array(numbers);
    }

}
    

    
