import java.util.*;
  import java.io.*;
  
  public class MIDDLE {
    public static void findIt(String s, StringBuffer sb, int i){
      if(i>=s.length()){
        System.out.println(sb);
        return;
      }
      if(s.charAt(i)>='0' && s.charAt(i)<='9'){
        sb.append(s.substring(i,i+1));
        findIt(s, sb, i+1);
        sb.delete(sb.length()-1, sb.length());
      }
      else{
        sb.append(s.substring(i,i+1).toUpperCase());
        findIt(s, sb, i+1);
        sb.delete(sb.length()-1, sb.length());
        sb.append(s.substring(i,i+1).toLowerCase());
        findIt(s, sb, i+1);
        sb.delete(sb.length()-1, sb.length());
      }
    }
    public static void main(String args[]) throws IOException {

      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      findIt(s, new StringBuffer(), 0);
      sc.close();
    }
  }