package Lesson4;

public class Main {
    public static void main(java.lang.String[] args) {
        GBList<Integer> list = new GBLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);

        list.show();

        System.out.println();
        System.out.println("-".repeat(15));

        System.out.println(list.size());
        System.out.println("-".repeat(15));

        System.out.println( list.get(1));
        System.out.println( list.get(7));

    }
}
