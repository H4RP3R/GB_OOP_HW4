public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lnkLst = new MyLinkedList<>();
        System.out.println(lnkLst); // []

        lnkLst.add(1);
        lnkLst.add(2);
        lnkLst.add(3);
        lnkLst.add(15);

        System.out.println("Size: " + lnkLst.size()); // Size: 4
        System.out.println(lnkLst); // [1, 2, 3, 15]

        lnkLst.addFirst(99);
        lnkLst.addFirst(100);
        System.out.println(lnkLst); // [100, 99, 1, 2, 3, 15]
        System.out.println("Size: " + lnkLst.size()); // Size: 6

        System.out.println(lnkLst.get(1)); // 99
        // System.out.println(lnkLst.get(-1)); // IndexOutOfBoundsException
    }
}