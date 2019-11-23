package uk.ac.cam.aib36.linkedLists;

public class Main {
    public static void main(String[] args) throws Exception {

        OOPArrayList arrayList = new OOPArrayList();

        arrayList.addToHead(3);
        arrayList.addToHead(4);
        arrayList.addToHead(2);

        System.out.println(arrayList.getNthElement(1));
        System.out.println(arrayList.getNthElement(2));

        arrayList.removeFromHead();

        System.out.println(arrayList.getNthElement(1));

        System.out.println(arrayList.getLength());
    }
}
