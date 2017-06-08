
public class Main {

    public static void main(String[] args) {
        LinkedList linko = new LinkedList();
        linko.addLast(5);
        linko.addLast(6);
        linko.addLast("randomString");
        linko.addLast(8);
        linko.addLast(9);
        linko.printAll();
        System.out.println(linko.contains(8));
        linko.removeByIndex(3);
        System.out.println(linko.contains(8));
        linko.printAll();
        System.out.println(linko.getByIndex(1));
        linko.printAll();
        linko.addToIndex(2, 8);
        System.out.println("After add to index");
        linko.printAll();
    }
}
