import java.util.HashMap;

public class Mirror_Frequency_Distance {
    public static void main(String[] args) {
        String s = "ab1z9" ;
        HashMap<Character , Integer> map = new HashMap<>() ; 
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch , map.get(ch) +1 ) ; 
            }
            else{
                map.put(ch , 1) ; 
            }
        }
        int ans = 0 ;
        for(char X : map.keySet())
        {
            char mirror ;
            if(Character.isDigit(X))
            {
                mirror = (char)('9' - (X - '0'));
            }
            else
            {
                mirror =  (char) ('z' - (X - 'a'));
            }
            if (map.containsKey(mirror) && X > mirror) {
                continue;
            }
            int f1 = map.get(X) ;
            int f2 = 0 ; 
            if(map.containsKey(mirror))
            {
                f2 = map.get(mirror) ;
            }
            ans += Math.abs(f1-f2) ; 
        }
        System.out.println(ans);
    }
}
