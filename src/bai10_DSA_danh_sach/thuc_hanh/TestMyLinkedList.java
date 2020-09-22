package bai10_DSA_danh_sach.thuc_hanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
