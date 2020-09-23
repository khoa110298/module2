package bai11_generic_stack_queue.bai_tap;

public class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
class Queue{
    private Node front;
    private Node rear;
    public int size =1;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if (this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
        size++;
    }
    public Node deQueue() {
        if (this.front == null)
            throw new IllegalArgumentException("lỗi");
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front==null)
            this.rear=null;
        size--;
        return temp;
    }
    public String disPlay(){
        String str = "";
        for (int i=0;i<size;i++){
            if (i==size-1){
                str += front.data;
            }else {
                str += front.data + ",";
                front = front.link;
            }
        }
        return str;
    }
}