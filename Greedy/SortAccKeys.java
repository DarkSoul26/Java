import java.util.*;

public class SortAccKeys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Items items[] = new Items[n];
        int f,e;
        for(int i=0;i<n;i++){
            f = sc.nextInt();
            e = sc.nextInt();
            items[i] = new Items(f,e);
        }

        // Method 1:
        Arrays.sort(items, new Comparator<Items>(){
            public int compare(Items a, Items b){
                if(a.t == b.t)
                    return a.f - b.f;
                return a.t - b.t;
            }
        });

        // Method 2:
        // Arrays.sort(items, (a,b) -> a.t == b.t ? a.f - b.f : a.t - b.t);

        //Method 3: 
        // Arrays.sort(items, Comparator.comparingInt((o->o.t)));

        for(int i=0;i<n;i++){
            System.out.println(items[i].f + " + " + items[i].e+" = "+items[i].t);
        }
        sc.close();
    }
}

class Items{
    int f;
    int e;
    int t;
    Items(int f, int e){
        this.f = f;
        this.e = e;
        t = this.f+this.e;
    }
}
