public class maxsumsubarray3 { // kadance's algorithm to find max sum of subarray 

public static void kadance(int numbers[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0; i<numbers.length; i++){
        cs= cs + numbers[i];
        if (cs < 0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
    }
    System.out.print("our max subarray sum  is : "+ ms);


}

public static void main(String args[]){
    int numbers[]= {-2, -3, 4, -1, -2, 1, 5, -3};
    kadance(numbers);
}
    
}
