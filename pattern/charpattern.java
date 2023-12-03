public class charpattern {
    public static void main(String args[]) {
        int n=4;
        char ch ='A';


        //outer loop to print no of rows
        for(int i=1; i<=n; i++)
        {
            //inner loop  to print star
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch ++;
            }
            System.out.println();
        }
    }

    
}
