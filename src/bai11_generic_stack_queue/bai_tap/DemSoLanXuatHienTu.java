package bai11_generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHienTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String[] inputArray = scanner.nextLine().split(" ");
        TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
        for(int i = 0; i < inputArray.length; i++){
            String key = inputArray[i].toLowerCase();
                if(myMap.get(key) == null) {
                    myMap.put(key, 1);
                }
                else {
                    myMap.put(key, (myMap.get(key))+1);
                }
            }
        for(String entry : myMap.keySet()) {
            System.out.println(entry + " : "+ myMap.get(entry));
        }
    }
}