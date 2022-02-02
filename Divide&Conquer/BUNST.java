// Question Link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/BUNST

// PrepBuddy has N sticks having different heights. He wants to create a bundle of 
// K sticks such that all the k sticks have the same height. He can cut the stick into 
// as many pieces as he wants (provided the height of the stick should remain an 
// integer).He asks for your assistance in choosing the maximum height of the stick 
// for forming the bundle of K sticks.

import java.util.*;
  import java.io.*;
  
  public class BUNST {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      List<Long> al = new ArrayList<>();
      for(int i=0;i<n;i++)
        al.add(sc.nextLong());
      
      Collections.sort(al, Collections.reverseOrder());
      
      long l = 0;
      long r = al.get(0);
      long ans = 0;
      while(l<=r){
        long mid = l+(r-l)/2;
        long sum = 0;
        for(int i=0;i<n;i++){
          if(al.get(i)/mid==0)
            break;
          sum+=al.get(i)/mid;
        }
        
        if(sum>=k){
          ans = mid;
          l = mid+1;
        }
        else
          r = mid-1;
      }
      System.out.println(ans);
      sc.close();
    }
  }