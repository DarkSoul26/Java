// You are given a linked list consisting of N nodes. your task is to find the 
// length of the longest palindrome in the linked list.
// Note:- Expected space complexity O(1).

import java.io.*;
import java.util.*;
public class Main {
static class SinglyLinkedListNode {
public int data;
public SinglyLinkedListNode next;
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

// Complete the longestPalindrome function below.

/*
For your reference:

SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
}
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/
// static int longestPalindrome(SinglyLinkedListNode head) {
// //write your code here

// }

static int countCommon(SinglyLinkedListNode a, SinglyLinkedListNode b)
{
    int count = 0;
    for (; a != null && b != null;
            a = a.next, b = b.next)
        if (a.data == b.data)
            ++count;
        else
            break;
    return count;
}
 
static int longestPalindrome(SinglyLinkedListNode head) {

    int result = 0;
    SinglyLinkedListNode prev = null, curr = head;

    while (curr != null)
    {

        SinglyLinkedListNode next = curr.next;
        curr.next = prev;
 
        result = Math.max(result,
                    2 * countCommon(prev, next)+1);

        result = Math.max(result,
                    2*countCommon(curr, next));
 
        prev = curr;
        curr = next;
    }
    return result;
}
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) throws IOException {
int testCases = 1;
while (testCases-- > 0) {
SinglyLinkedList llist = new SinglyLinkedList();
int llistCount = scanner.nextInt();
for (int i = 0; i < llistCount; i++) {
    int llistItem = scanner.nextInt();
    llist.insertNode(llistItem);
}
System.out.println(longestPalindrome(llist.head));
}
scanner.close();
}
}