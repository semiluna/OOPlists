package uk.ac.cam.aib36.linkedLists;

import java.util.ArrayList;

public class OOPArrayList implements OOPList {

    private int[] list; //head is the last element
    private int length;
    private int capacity = 1;

    OOPArrayList(int[] ref) {
        this.list = new int[capacity];

        for (int i = 0; i < ref.length; i++) {
            addToHead(ref[ i ]);
        }
    }

    OOPArrayList() {
        this.list = new int[capacity];
        this.length = 0;
    }

    @Override
    public void removeFromHead() {
        if (length > 0)
            length--;
    }

    @Override
    public void addToHead(int v) {
        if (length == capacity) {
            capacity *= 2;

            int[] aux = new int[capacity];

            for (int i = 0; i < length; i++) {
                aux[i] = list[i];
            }

            list = aux;
        }


        list[length++] = v;
    }

    @Override
    public int getHeadValue() {
        return list[length-1];
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if (length == 0)
            return true;
        return false;
    }

    @Override
    public int getNthElement(int n) throws Exception {
        if (n < 1 || n > length)
            throw new Exception("Not enough elements in the list");
        return list[length - n];
    }
}
