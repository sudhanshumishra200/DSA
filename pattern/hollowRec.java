public class hollowRec {

    public static void hollow_rectangle(int totRows , int totCols){
        //for outer loop 
        for(int i =1; i<= totRows; i++){
            //for inner - columns  
            for(int j =1; j<= totCols; j++){
                  // for cells- (i,j)
                if(i==1 || i==totRows || i==j || (j==((totCols)-i+1) && i<(totRows/2)+1) || i ==(totRows/2)+1 || j==1 || j== totCols || j == (totCols/2)+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();//for next line 

        }
    }
    public static void main(String args[]){
        hollow_rectangle(11,11);
    }
    
}
