package com.buffish.data.array;

public class DynamicArray {
    private int size = 0; // 数组大小
    private int capacity = 8; // 数组容量
    private int[] array = new int[capacity];

    public void addLast(int elem) {
//        array[size++] = elem;
        this.add(size, elem);
    }

    public void add(int index, int elem) {
        if (index < 0 || index > size) {
            throw new Error("传入的数组索引越界");
        }
        if (index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = elem;
        size++;
    }
}
