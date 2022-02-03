import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float cap = sc.nextFloat();
        float wt[] = new float[n];
        float prof[] = new float[n];
        
        Product[] pr = new Product[n];

        for(int i=0;i<n;i++){
            wt[i] = sc.nextFloat();
            prof[i] = sc.nextFloat();
            pr[i] = new Product(wt[i],prof[i]);
        }

        fractionalKnapsack(pr,cap, n);
        sc.close();
    }

    private static void fractionalKnapsack(Product[] pr, float cap, int n) {

        Arrays.sort(pr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.pw<o2.pw)
                    return -1;
                else if(o1.pw>o2.pw)
                    return 1;
                else
                    return 0;
                // return (int) (o1.pw-o2.pw);
            }
        });
        float finalProf = 0;
        boolean flag = false;
        int i = 0;
        for(i=n-1;i>=0;i--){
            if(cap>0 && pr[i].wt<=cap){
                cap = cap - pr[i].wt;
                finalProf+=pr[i].profit;
            }
            else{
                flag = true;
                break;
            }
        }
        if(flag){
            finalProf+=pr[i].profit*(cap/pr[i].wt);
        }
        System.out.println(finalProf);
    }
}

class Product{
    float wt;
    float profit;
    float pw;
    Product(float wt, float profit){
        this.wt = wt;
        this.profit = profit;
        pw = profit/wt;
    }
}
