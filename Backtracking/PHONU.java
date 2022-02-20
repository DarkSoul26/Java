import java.util.*;
  import java.io.*;
  
  public class PHONU{
    public static String alpha[] = {"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv" ,"wxyz"};
    public static List<String> al;
    public static void findIt(int n, StringBuffer sb){
      if(n == 0){
        StringBuffer temp = new StringBuffer(sb);
        temp.reverse();
        al.add(temp.toString());
        return;
      }
      int x = n%10;
      for(int i=0;i<alpha[x].length();i++){
        sb.append(alpha[x].charAt(i));
        findIt(n/10, sb);
        sb.delete(sb.length()-1, sb.length());
      }
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        al = new ArrayList<>();
        int n = sc.nextInt();
        findIt(n, new StringBuffer());
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
          System.out.print(al.get(i)+" ");
        System.out.println();
      }
    }
  }