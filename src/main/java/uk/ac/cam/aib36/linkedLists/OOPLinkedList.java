package uk.ac.cam.aib36.linkedLists;

class OOPLinkedList implements OOPList {

    private OOPLinkedListElement head;
    private int length;

    OOPLinkedList() {
        this.head = null;
        this.length = 0;
    }

    OOPLinkedList(int value) {
        OOPLinkedListElement element = new OOPLinkedListElement(value);
        this.head = element;
        this.length = 1;
    }

    public void removeFromHead() {
        OOPLinkedListElement next = this.head.getRef();
        this.head = next;
        this.length--;
    }

    public void addToHead(int value) {
        OOPLinkedListElement newHead = new OOPLinkedListElement(value, this.head);
        this.head = newHead;
        this.length++;

    }

    public int getHeadValue() {
        return this.head.getValue();
    }

    OOPLinkedListElement getHeadRef() {
        return this.head;
    }

    private int getNthElement(int n, OOPLinkedListElement elementRef) {
        if (n == 1) {
            return elementRef.getValue();
        } else {
            return getNthElement(n-1, elementRef.getRef());
        }
    }

    public int getNthElement(int n) throws Exception {
        if (n > length)
            throw new Exception("Not enough elements in the list");
        return getNthElement(n, this.head);
    }

    public boolean isEmpty() {
        if (this.head == null)
            return true;
        return false;
    }

    public int getLength() {
        return this.length;
    }

}
