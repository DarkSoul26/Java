import java.util.*;
  import java.io.*;
  
  public class MINS {
    public static boolean checkIt(String s, int K)
    {
        // Iterate over all possible characters
        for (int ch = 0; ch < 26; ch++) {
            char c = (char)( 'a' + ch);
      
            // stores the last occurrence
            int last = -1;
      
            // set answer as true;
            boolean found = true;
            for (int i = 0; i < K; i++)
                if (s.charAt(i) == c)
                    last = i;
      
            // No occurrence found of current
            // character in first substring
            // of length K
            if (last == -1)
                continue;
      
            // Check for every last substring
            // of length K where last occurr-
            // ence exists in substring
            for (int i = K; i < s.length(); i++) {
                if (s.charAt(i) == c)
                    last = i;
      
                // If last occ is not
                // present in substring
                if (last <= (i - K)) {
                    found = false;
                    break;
                }
            }
            // current character is K amazing
            if (found)
                return true;
        }
        return false;
    }
    // public static boolean checkIt(String s, int mid){
      
    //   for(int i=0;i<mid;i++){
    //     boolean flag = false;
    //     char a = s.charAt(i);
    //     for(int j=1;j<s.length()-mid+1;j++){
    //       String k = s.substring(j,j+mid);
    //       if(k.indexOf(a) == -1){
    //         flag = true;
    //         break;
    //       }
    //     }
    //     if(!flag){
    //       return true;
    //     }
    //   }
    //   return false;
    // }
    public static void main(String args[]) throws IOException {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        String s = sc.next();
        int l = 0, r = s.length()-1;
        int ans = 1;
        while(l<=r){
          int mid = l+(r-l)/2;
          boolean x = checkIt(s, mid);
          if(x){
            ans = mid;
            r = mid-1;
          }
          else{
            l = mid+1;
          }
        }
        if(ans == -1){
          if(s.length()==1)
            System.out.println(1);
          else if(s.length()==2)
            System.out.println(2);
        }
        else
        if(s.length()==2 && (s.charAt(0)!=s.charAt(1)))
          System.out.println(2);
        else
          System.out.println(ans);
      }
      sc.close();
    }
  }