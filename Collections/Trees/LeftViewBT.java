import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

/*
Complete the function leftView given below.
For your reference:
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
  Node a[] = new Node[1001];
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
int max_level = 0;
void leftViewNextLvl(Node q, int lvl){
    if(q==null)
      return;
    // Node temp = q.deque();
    if(max_level<lvl){
      System.out.print(q.value+" ");
      max_level = lvl;
    }
    if(q.left!=null){
      // q.enque(temp.left);
      leftViewNextLvl(q.left,lvl+1);
    }
    if(q.right!=null){
      leftViewNextLvl(q.right,lvl+1);
    }
}
void leftView(Node node)
{
  // treeQueue q = new treeQueue();
  // q.enque(node);
   leftViewNextLvl(node,1);
}



}
public class Main {

    public static void main(String[] args) {
        // write your code here
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createTreeByLevelTree();
        bt.root = bt.replaceNegativeOne(bt.root);
        bt.leftView(bt.root);
        bt.deleteTree(bt.root);
    }
}