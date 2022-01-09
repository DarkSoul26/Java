// Question Link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/11/heaps/codingAssignment/MINHEAP
// Given an array containing N integers, your task is to create a min-heap using 
// the elements of the given array and print the heap array. Elements needs to be 
// inserted one by one in the heap. Note: Use heap concepts to solve the problem.

import java.util.*;
  import java.io.*;
  class MinHeap{
    private int[] Heap;
    private int size;
    private int maxSize;
    
    MinHeap(int maxSize){
      this.maxSize = maxSize;
      size = 0;
      Heap = new int[this.maxSize+1];
      Heap[0] = Integer.MIN_VALUE;
    }
    
    void insert(int element){
      Heap[++size] = element;
    }
    
    void buildHeap(){
      int j = (int)Math.floor(size/2.0);
      for(int i = j;i>=1;i--){
        minHeapify(Heap, i);
      }
    }
    
    private void minHeapify(int[] heap, int i){
      if(isLeaf(i))
        return;
      int lChild = 2*i;
      int rChild = 2*i+1;
      if(rChild<=size){
        if(heap[i]<=heap[lChild] && heap[i]<=heap[rChild]){
          return;
        }
      }
      else{
        if(heap[i]<=heap[lChild])
          return;
      }
      int largest = -1;
      if(lChild<=size && heap[i]>heap[lChild]){
        largest = lChild;
      }
      else 
        largest = i;
      if(rChild<=size && heap[rChild]<heap[largest])
        largest = rChild;
      if(largest!=i){
        int temp = heap[i];
        heap[i] = heap[largest];
        heap[largest] = temp;
      }
      minHeapify(heap, largest);
        
    }
    
    private boolean isLeaf(int i){
      if(i>(size/2) && i<=size)
        return true;
      return false;
    }
    
    void printHeap(){
      for(int i=1;i<=size;i++)
        System.out.print(Heap[i]+" ");
      System.out.println();
    }
  }
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        MinHeap minheap = new MinHeap(n);
        for(int i=0;i<n;i++){
          minheap.insert(sc.nextInt());
        }
        minheap.buildHeap();
        minheap.printHeap();
        
        // int a[] = new int[n];
        // Queue<Integer> q = new PriorityQueue<>();
        // for(int i=0;i<n;i++)
        //   q.add(sc.nextInt());
        // Iterator value = q.iterator();
        // while (value.hasNext()) {
        //     System.out.print(value.next()+" ");
        // }
        // System.out.println();
      }
    }
  }