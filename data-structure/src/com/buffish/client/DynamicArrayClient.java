package com.buffish.client;

import com.buffish.data.array.DynamicArray;

public class DynamicArrayClient {
    static { DataClient.ready("动态数组"); }
    public static void run() {
        DynamicArray arr = new DynamicArray();
        arr.addLast(1);
        arr.addLast(2);
        arr.addLast(3);
        arr.addLast(4);
        arr.addLast(5);
        arr.traverse(System.out::println);
        for (Integer elem : arr) {
            System.out.println(elem);
        }
    }
}
