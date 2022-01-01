import java.util.*;
import java.util.*;
import java.util.Scanner;
import java.io.*;

class Node
{
    long value;
    Node left, right;

    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node createNode(long value) {
        Node t = new Node(value);
        return t;
    }

    Node replaceNegativeOne(Node root) {
        if (root == null || (root.value == -1 && root.left == null && root.right == null)) {
            return null;
        }
        root.left = replaceNegativeOne(root.left);
        root.right = replaceNegativeOne(root.right);
        return root;
    }

    Node createTreeByLevelTree() {
        Scanner sc = new Scanner(System.in);
        long n, m;
        Queue<Node> queue = new LinkedList<>();
        Node t;
        root = null;
        while (sc.hasNext()) {
            n = sc.nextLong();
            if (queue.isEmpty()) {
                root = createNode(n);
                ((LinkedList<Node>) queue).add(root);
                continue;
            }
            m = sc.nextLong();
            t = ((LinkedList<Node>) queue).peekFirst();
            ((LinkedList<Node>) queue).pop();
            t.left = createNode(n);
            t.right = createNode(m);
            if (t.left.value != -1)
                ((LinkedList<Node>) queue).add(t.left);
            if (t.right.value != -1)
                ((LinkedList<Node>) queue).add(t.right);
            if (queue.isEmpty())
                break;
        }
        return root;
    }

    void deleteTree(Node node) {
        node = null;
    }

/* Complete the function levelOrderTraversal given below.
For your reference
class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/
public class treeQueue{
  Node a[] = new Node[20];
  int front = 0;
  int rear = 0;
  public void enque(Node item){
    this.a[rear] = item;
    // System.out.println(this.a[rear].value);
    this.rear++;
  }
  public Node deque(){
    // if(!this.isEmpty()){
      Node temp = this.a[front];
      this.front++;
      return temp;
    // }
    // return null;
  }
  public boolean isEmpty(){
    if(this.front == this.rear)
      return true;
    return false;
  }
}

void levelOrderTraversal(Node node) {
    
    treeQueue q = new treeQueue();
    q.enque(node);
    while(!q.isEmpty()){
      Node temp = q.deque();
      System.out.print(temp.value+" ");
      if(temp.left!=null)
        q.enque(temp.left);
      if(temp.right!=null)
        q.enque(temp.right);
    }
    //write your code here
}


}
public class Main {

    public static void main(String[] args) {
        // write your code here
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createTreeByLevelTree();
        bt.root = bt.replaceNegativeOne(bt.root);
        bt.levelOrderTraversal(bt.root);
        bt.deleteTree(bt.root);
    }
}