package hello;
public class array2 {
	public static void main(String[] args) {
		int a[]= {2,3,-5,4,0,-10,7};
		int x=a.length;
		int temp;
		for(int i=0;i<x-1;i++) {
			for(int j=0;j<x-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int item: a) {
			System.out.print(item+" ");
		}
}
}