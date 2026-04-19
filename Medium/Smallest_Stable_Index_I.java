public class Smallest_Stable_Index_I {
    public static void main(String[] args) {
        int [] nums = { 5,0,1,4} ;
        int k = 3 ;
        int [] leftmax = new int[nums.length] ; 
        int [] rightmin = new int[nums.length] ;
        leftmax[0] = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] > leftmax[i-1])
            {
                leftmax[i] = nums[i] ; 
            }
            else
            {
                leftmax[i] = leftmax[i-1] ; 
            }
        }

        rightmin[nums.length-1] = nums[nums.length-1] ; 
        for(int i= nums.length-2 ; i >= 0 ; i--)
        {
            if(rightmin[i+1] > nums[i])
            {
                rightmin[i] = nums[i] ;
            }
            else{
                rightmin[i] = rightmin[i+1] ;
            }
        }

        for (int i = 0; i < rightmin.length; i++) {
            int sub = leftmax[i] - rightmin[i] ; 
            if(sub <= k)
            {
                System.out.println(i);
                return ; 
            }
        }
    }

}
