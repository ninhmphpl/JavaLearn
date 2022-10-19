package OOP.StackAndQueue.Queue.Practice;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
