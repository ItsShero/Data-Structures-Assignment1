/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 * @author sonia
 */
public class ArrayList<E> extends AbstractList<E> implements List<E> {

    private Object[] elementData;
    private int size; //Capacity of ArrayList

    /*Constructs an empty list with an initial capacity of ten. */
    public ArrayList() {
        this(10);
        elementCount = 0;
        size = 10;
    }

    /**
     * * Constructs an empty list with the specified initial capacity.
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }

        this.elementData = new Object[initialCapacity];
        size = initialCapacity;
        elementCount = 0;
    }

    /*Returns the element at the specified position in this list. */
    public E get(int index) {
        rangeCheck(index);
        return (E) elementData[index];
    }

    /* Replaces the element at the specified position in this list with the specified element.*/
    public E set(int index, E element) {
        rangeCheck(index);
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    /* Checks if the given index is in range. */
    private void rangeCheck(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("out Of Bound index");
        }
    }

    /* Inserts the specified element at the specified position in this list. */
    public void add(int index, E element) {
        rangeCheck(index);
        if (elementCount + 1 <= size) {
            for (int i = elementCount - 1; i >= index; i--) {
                elementData[i + 1] = elementData[i];
            }

            elementData[index] = element;
            elementCount++; // Increments  the element count of the array
        }
    }

    /* Removes the element at the specified position in this list.*/
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = (E) elementData[index];
        for (int i = index; i < elementCount; i++) {
            elementData[i] = elementData[i + 1];
        }

        elementData[--elementCount] = null;
        return oldValue;
    }

    public int getSize() {
        return size;
    }

}
