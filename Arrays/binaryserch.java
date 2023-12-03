public class binaryserch {
    public static int binary_Search(int numbers[],int key){
        int start=0, end =numbers.length -1;

        while(start<=end ){
            int mid = (start + end )/2;

            if (key == numbers[mid] ){
                //System.out.println("key is : "+ mid);
                return mid;
            }
            else if (key < numbers[mid] ){// left
                end = mid -1;

            }else {//right
                start =mid +1;
            }
           // mid = (start +end )/2;

           
        }
         return -1;

    }

    public static void main(String args[]){
        int numbers[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key =10;

        System.out.print("the key found at : "+ binary_Search(numbers, key));

    }
}
