import java.util.*;
  import java.io.*;
  
  public class ENCRYPT {
    // public static boolean flag = false;
    public static void findAllPossible(int n, int j, int []a, int i, boolean flag){
      if(j==n){
        
        StringBuffer sb1 = new StringBuffer();
        for(int k=0; k<4; k++){
          sb1.append(a[k]);
        }
        StringBuffer sb2 = new StringBuffer();
        for(int k=4; k<10; k++){
          sb2.append(a[k]);
        }
        // System.out.println(sb1.toString()+sb2.toString());
        int hrs = Integer.parseInt(sb1.toString(), 2);
        int min = Integer.parseInt(sb2.toString(), 2);
        if(min>=60 || min<0){
            return;
        }
        if(hrs>11 || hrs<0)
            return;   
        System.out.print(hrs+":");
        if(min/10==0){
          System.out.print("0"+min+" ");
        }
        else    
          System.out.print(min+" ");
        return;
      }
      if(j>n || (flag && i>=4))
        return;
      if(i == 10){
        flag = true;
        i = 0;
      }
      a[i] = 1;
        findAllPossible(n, j+1, a, i+1, flag);
      a[i] = 0;
        findAllPossible(n, j, a, i+1, flag);
      // a[i] = -1;
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[10];
      // Arrays.fill(a, -1);
      findAllPossible(n, 0, a , 4, false);
      sc.close();
    }
  }