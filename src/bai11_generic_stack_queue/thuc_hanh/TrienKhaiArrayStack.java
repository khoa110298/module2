package bai11_generic_stack_queue.thuc_hanh;

public class TrienKhaiArrayStack {
    private int arr[];
    private int size;
    private int index=0;

    public TrienKhaiArrayStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public int size(){
        return index;
    }

    public boolean isFull(){
        if (index ==size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }
    public void push(int elment){
        if (isFull()){
            throw new StackOverflowError("stack's full");
        }
        arr[index]=elment;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("stack is null");
        }
        return arr[--index];
    }
}
class TestArrayStack{
    public static void main(String[] as) throws Exception {
        TrienKhaiArrayStack stack = new TrienKhaiArrayStack(10);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("2. Size of stack after push operations: " + stack.size());
    }
}
