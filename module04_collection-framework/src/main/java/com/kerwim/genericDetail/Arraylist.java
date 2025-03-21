package com.kerwim.genericDetail;

class Arraylist<E> {
    private Object[] elementData;
    private int size = 0;

    public Arraylist(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }
    
    public boolean add(E e) {
        elementData[size++] = e;
        return true;
    }
    
    E elementData(int index) {
        return (E) elementData[index];
    }
}