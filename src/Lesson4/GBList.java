package Lesson4;

public interface GBList<S> extends Iterable<S>{
    boolean addFirst(S s);
    S get(int index);
    int size();

    boolean addLast(S s);
    void show();

}
