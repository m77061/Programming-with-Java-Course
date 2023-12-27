public class Main {
    public static void main(String[] args) {
        CustomList l = new CustomList();
        l.add(3);
        l.add(2);
        l.add(4);
        l.add(5);
        l.insertAt(1, 3);
        l.removeAt(0);

        System.out.println();
    }
}
