package uk.ac.cam.aib36.linkedLists;

class OOPSortedLinkedList extends OOPLinkedList {

    @Override
    public void addToHead(int value) {
        super.addToHead(value);
        this.sort();

    }

    void sort() { //bubbleSort
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (OOPLinkedListElement ref = this.getHeadRef(); ref != null; ref = ref.getRef()) {
                sorted = sorted & sortElements(ref, ref.getRef());
            }
        }
    }

    static private boolean sortElements(OOPLinkedListElement left, OOPLinkedListElement right) {
        if (right == null) {
            return true;
        }
        if (left.getValue() > right.getValue()) {
            OOPLinkedListElement.swapElements(left, right);
            return false;
        }

        return true;
    }
}
