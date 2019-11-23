package uk.ac.cam.aib36.linkedLists;

class OOPLinkedListElement {
    private int value;
    private OOPLinkedListElement ref;

    static void swapElements(OOPLinkedListElement ref1, OOPLinkedListElement ref2) {
        int aux = ref1.getValue();
        ref1.setValue(ref2.getValue());
        ref2.setValue(aux);
    }

    OOPLinkedListElement(int value, OOPLinkedListElement ref) {
        this.value = value;
        this.ref = ref;
    }

    OOPLinkedListElement(int value) {
        this.value = value;
        this.ref = null;
    }

    void setValue(int value) {
        this.value = value;
    }

    void setRef(OOPLinkedListElement ref) {
        this.ref = ref;
    }

    int getValue() {
        return this.value;
    }

    OOPLinkedListElement getRef() {
        return this.ref;
    }


}
