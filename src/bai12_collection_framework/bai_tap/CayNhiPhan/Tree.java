package bai12_collection_framework.bai_tap.CayNhiPhan;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
