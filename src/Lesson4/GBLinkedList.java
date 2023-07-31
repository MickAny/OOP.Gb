package Lesson4;

import java.util.Iterator;

public class GBLinkedList<U> implements GBList<U>{
    private U[] values;

    @SuppressWarnings("Unchecked")
    public GBLinkedList() {
        this.values = (U[])new Object[0];
    }


    @SuppressWarnings("Unchecked")
    @Override
    public boolean addFirst(U u) {
        try {
            U[] tempArray = values;
            values = (U[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 1, tempArray.length);
            values[0] = u;
            return true;
        }catch (ClassCastException e){
            return false;
        }
    }
    @SuppressWarnings("Unchecked")
    @Override
    public boolean addLast(U u) {
        try {
            U[] tempArray = values;
            values = (U[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, tempArray.length);
            values[values.length-1] = u;
            return true;
        }catch (ClassCastException e){
            return false;
        }
    }

    @Override
    public U get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        System.out.print("List's size is ");
        return values.length;
    }

    @Override
    public Iterator<U> iterator() {
        return new ArrayIterator<U>(values);
    }

    @Override
    public void show(){
        System.out.println("List:");
        for (Object o : values) {
            System.out.print(o + " ");
        }
    }
}
