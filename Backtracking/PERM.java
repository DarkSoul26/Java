import java.util.*;
  import java.io.*;
  
  public class PERM {
    
    public static void findIt(int a[], int i, List<Integer> al){
      if(i>=a.length){
        for(int j=0;j<al.size();j++){
          System.out.print(al.get(j)+" ");
        }
        System.out.println();
      }
      
      for(int j=0;j<a.length;j++){
        if(!al.contains(a[j])){
          al.add(a[j]);
          findIt(a, i+1, al);
          al.remove(al.size()-1);
        }
      }
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      Arrays.sort(a);
      findIt(a, 0, new ArrayList<>());
    }
  }