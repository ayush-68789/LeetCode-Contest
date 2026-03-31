public class Find_Valid_Matrix_Given_Row_and_Column_Sums {
    public static void main(String[] args) {
        int [] rsum = {3, 8} ;
        int [] csum = {4, 7} ;

        int row = rsum.length ;
        int col = csum.length ;
        int [][] ans = new int [row][col] ;

        int i = 0 , j = 0 ;

        while(i < row && j < col)
        {
            ans[i][j] = Math.min(rsum[i], csum[j]) ;
            rsum[i] = rsum[i] - ans[i][j] ;
            csum[j] = csum[j] - ans[i][j] ; 

            if(rsum[i] == 0)
            {
                i++ ;
            }
            if(csum[j] == 0)
            {
                j++ ;
            }
        }

        for (int j2 = 0; j2 < ans.length; j2++) {
            for (int k = 0; k < ans.length; k++) {
                System.out.print(ans[j2][k]+" ");
            }
            System.out.println();
        }
    }
}
