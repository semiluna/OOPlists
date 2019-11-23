package uk.ac.cam.aib36.linkedLists;

public interface OOPList {

    void removeFromHead();

    void addToHead(int v);

    int getHeadValue();

    int getLength();

    boolean isEmpty();

    int getNthElement(int n) throws Exception;


}
