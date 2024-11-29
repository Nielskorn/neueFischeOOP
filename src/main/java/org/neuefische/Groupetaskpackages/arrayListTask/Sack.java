package org.neuefische.Groupetaskpackages.arrayListTask;

import java.util.Arrays;

public class Sack {
    Object[] elements;
    int size;

    public Sack() {
        elements = new Object[10];
        size = 0;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add( Object element) {
        ensureCapacity();
       elements[size++] = element;

        }


    @SuppressWarnings("unchecked")
    public <T> Object get(int index){
    checkIndex(index);
    return (T) elements[index];
    }
    @SuppressWarnings("uncecked")
    public <T> Object set(int index, T element){
    checkIndex(index);
    T oldElement = (T) elements[index];
    elements[index] = element;
    return oldElement;
    }
    public <T> Object remove(int index){
        checkIndex(index);
        T removedElement= (T) elements[index];
        System.arraycopy(elements, index+1, elements, index, elements.length-index-1);
        elements[--size] = null;
        return removedElement;
    }
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        if(size == elements.length){
            elements = Arrays.copyOf(elements, elements.length*2);
        }
    }
    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
