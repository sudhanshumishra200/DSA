import java.util.*;
public class starpattern {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for (int i =1 ; i<=n ;i++){
        {
            for(int j=1 ; j<=i; j++) // for inverted star we simply put j<=n-i+1
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }

    }
    
}
