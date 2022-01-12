// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/11/heaps/codingAssignment/OPHEAP

// Given an array containing N integers, your task is:

// To create min-heap(Insert elements one by one).
// Extract the minimum element from the heap created in the first step and print it.
// Print the extracted element and updated heap after extraction, separated by space.
// Note: Use heap concepts to solve the problem.

import java.util.*;
import java.io.*;

public class OPHEAP {
public static void main(String[] args) throws IOException {
   Scanner sc = new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0) {
       int n = sc.nextInt();
       MinHeap minHeap = new MinHeap(n);
       for (int i = 0; i < n; i++) {
           minHeap.insert(sc.nextInt());
       }
       System.out.print(minHeap.remove()+" ");

       minHeap.printHeap(sc);
       System.out.println();
    }
   }

}
class MinHeap
{
private int[]Heap;
private int size;
private int maxSize;
private static final int FRONT = 1;
MinHeap(int maxSize)
{
   this.maxSize = maxSize;
   size=0;
   Heap = new int[this.maxSize+1];
   Heap[0] = Integer.MIN_VALUE;
}
private int parent(int pos) {
   return pos / 2;
}
private int leftChild(int pos)
{
   return (2*pos);
}
private int rightChild(int pos)
{
   return (2*pos)+1;
}
private boolean isLeaf(int pos)
{
   if(pos>=(size/2) && pos<=size)
       return true;
   return false;
}
private void swap(int fpos, int spos)
{
   int temp;
   temp = Heap[fpos];
   Heap[fpos]=Heap[spos];
   Heap[spos]=temp;
}
private void minHeapify(int pos)
{
   int left = leftChild(pos);
   int right = rightChild(pos);
   int largest = pos;
   if(left<=size && Heap[left]<Heap[largest])
       largest=left;
   if(right<=size && Heap[right]<Heap[largest])
       largest = right;

   if(largest!=pos)
   {
       swap(pos, largest);
       minHeapify(largest);
   }
}
void insert(int element)
{
   if(size>=maxSize)
       return;

   Heap[++size]=element;
   int i=size;
   while(Heap[i]<Heap[parent(i)])
   {
       swap(i,parent(i));
       i=parent(i);
   }
}
private void build_heap()
{
   int j=(int)Math.floor(size/2.0);
   for(int i=j;i>=1;i--){
       minHeapify(i);
   }

}
public void heapSort(Writer wr) throws IOException {
   build_heap();
   int length=size;
   for(int i=size;i>=2;i--)
   {
       swap(1,i);
       size--;
       minHeapify(1);
   }
   size=length;

}
public int remove()
{
   int popped = Heap[FRONT];
   Heap[FRONT] = Heap[size];
   size=size-1;
   minHeapify(FRONT);
   return popped;
}
public void deleteKey(int i)
{
   decreaseKey(i, Integer.MIN_VALUE);
   remove();
}

private void decreaseKey(int i, int new_val) {
   Heap[i]=new_val;
   while(i !=0 && Heap[parent(i)]>Heap[i])
   {
       swap(i,parent(i));
       i=parent(i);
   }
}

void printHeap(Scanner sc) throws IOException {
   for(int i=1;i<=size;i++)
   {
       System.out.print(Heap[i]+" ");
   }
}

}