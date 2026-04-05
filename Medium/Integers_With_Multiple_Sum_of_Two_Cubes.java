import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Integers_With_Multiple_Sum_of_Two_Cubes {
    public static void main(String[] args) {
        int n = 4104 ; 
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = (int)Math.cbrt(n) ; 
        for(int a = 1 ; a <= max ; a++)
        {
            for(int b = a ; b <= max ; b++)
            {
                int sum = a*a*a + b*b*b ;
                if(sum > n)
                {
                    break ; 
                } 
                else
                {
                    if (map.containsKey(sum)) 
                    {
                        map.put(sum, map.get(sum) + 1); 
                    }
                    else 
                    {
                        map.put(sum, 1);
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int x : map.keySet())
        {
            if(map.get(x) >= 2)
            {
                res.add(x) ; 
            }
        }
        Collections.sort(res) ; 
        System.out.println(res);

    }
}
