import java.io.*;
import java.util.*;
public class Main {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(){}
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

// Complete the mergeKLists() function below.

    /*
    For your reference:
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(){}
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    */
    static SinglyLinkedListNode mergeKLists(SinglyLinkedListNode []headList) {
    //write your code here
      SinglyLinkedListNode finalNode = new SinglyLinkedListNode(0);
      SinglyLinkedListNode final1 = finalNode;
      // SinglyLinkedListNode temp = null;
      while(true){
        int min = Integer.MAX_VALUE;
        int count = 0;
        int findThatNode = -1;
        for(int i=0;i<headList.length;i++){
          if(headList[i]!=null && headList[i].data<min){
            min = headList[i].data;
            findThatNode = i;
          }
          if(headList[i]==null)
            count++;
        }
        if(count == headList.length)
          return final1.next;
        finalNode.next = new SinglyLinkedListNode(min);
        finalNode = finalNode.next;
        headList[findThatNode] = headList[findThatNode].next;
      }
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = 1;
        while (testCases-- > 0) {
            int k=scanner.nextInt();
            SinglyLinkedListNode []headList = new SinglyLinkedListNode[k];
            int p=0;
            for(int j=0;j<k;j++) {
                SinglyLinkedList llist = new SinglyLinkedList();
                int llistCount = scanner.nextInt();
                for (int i = 0; i < llistCount; i++) {
                    int llistItem = scanner.nextInt();
                    llist.insertNode(llistItem);
                }
                headList[p++] = llist.head;
            }
           printLinkedList(mergeKLists(headList));
        }
        scanner.close();
    }
}