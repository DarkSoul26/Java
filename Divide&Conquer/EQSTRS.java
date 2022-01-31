Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/EQSTRS

import java.util.*;
  import java.io.*;
  
  public class EQSTRS {
    
    public static boolean findIt(String s1, String s2){
      if(s1.length() != s2.length())
        return false;
      else if(s1.equals(s2))
        return true;
      int len1 = s1.length();
      int len2 = s2.length();
      if(len1<=1)
        return false;
      boolean t1 = findIt(s1.substring(0,len1/2), s2.substring(0,len2/2));
      boolean t2 = findIt(s1.substring(len1/2, len1),s2.substring(len2/2, len2));
      boolean t3 = findIt(s1.substring(0,len1/2), s2.substring(len2/2, len2));
      boolean t4 = findIt(s2.substring(0,len2/2), s1.substring(len1/2, len1));
      if((t1 && t2) || (t3 && t4))
        return true;
      return false;
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      String s2 = sc.next();
      if(findIt(s1,s2))
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }