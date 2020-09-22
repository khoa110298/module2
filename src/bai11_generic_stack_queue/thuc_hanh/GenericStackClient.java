package bai11_generic_stack_queue.thuc_hanh;

public class GenericStackClient {
        public static void main(String[] args) {
            MyGenericStack myGenericStack=new MyGenericStack();
            System.out.println("1. Stack of integers");
            myGenericStack.stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            myGenericStack.stackOfIStrings();
        }
    }
