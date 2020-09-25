package bai12_collection_framework.bai_tap.array_list;

import java.util.Comparator;

public class SortPrice implements Comparator<Product> {

    @Override
    public int compare(Product t1, Product t2) {
        double res = t1.getPrice()-t2.getPrice();
        if (res>0){
            return -1;
        }else if (res<0){
            return 1;
        }
        return 0;
    }
}
