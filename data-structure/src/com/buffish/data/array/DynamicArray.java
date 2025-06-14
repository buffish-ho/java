package com.buffish.data.array;

import java.util.Iterator;
import java.util.function.Consumer;

public class DynamicArray implements Iterable<Integer> {
    private int size = 0; // 数组大小
    private int capacity = 8; // 数组容量
    private int[] array = new int[capacity];

    public void addLast(int elem) {
//        array[size++] = elem;
        this.add(size, elem);
    }

    public void add(int index, int elem) {
        this.check(index);
        if (index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = elem;
        size++;
    }

    public int get(int index) {
        this.check(index, size - 1);
        return array[index];
    }

    public void traverse(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(array[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }

    private void check(int index) {
        this.check(index, size);
    }

    private void check(int index, int pos) {
        if (index < 0 || index > pos) throw new Error("传入的数组索引越界");
    }
}
