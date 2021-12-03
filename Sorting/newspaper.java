// Rahul wants to create a newspaper. So he hires peoples who will help him collect 
// the news. Rahul asks them to give the content C as a string, P the popularity value
// and D if the news is related to his hometown. As Rahul's newspaper is a local
// newspaper he would print the local news before others in decreasing order of
// the P popularity.Rest all news will be printed in decreasing order of popularity.
// Note - Popularity is distinct.

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        Map<Integer, String> tm1 = new TreeMap<>(Collections.reverseOrder());
        Map<Integer, String> tm2 = new TreeMap<>(Collections.reverseOrder());
        while(n--!=0){
          String s = sc.next();
          int pop = sc.nextInt();
          int origin = sc.nextInt();
          
          if(origin == 1)
            tm1.put(pop,s);
          else
            tm2.put(pop,s);
        }
        for(Map.Entry el: tm1.entrySet())
          System.out.println(el.getValue());
        for(Map.Entry el: tm2.entrySet())
          System.out.println(el.getValue());
      }
    }
  }
