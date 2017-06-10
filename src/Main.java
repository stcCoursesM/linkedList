
public class Main {

    public static void main(String[] args) {
        LinkedList linko = new LinkedList();
        linko.addLast("a");
        linko.addLast("b");
        linko.addLast("c");
        linko.addLast("d");
        linko.addLast("e");
        linko.printAll();
        System.out.println(linko.contains("a"));
        linko.removeByIndex(0);
        linko.printAll();
        linko.removeByIndex(1);
        linko.printAll();
        linko.removeByIndex(3);
        linko.printAll();
        System.out.println(linko.contains("a"));
        linko.printAll();
        System.out.println(linko.getByIndex(5));
        System.out.println(linko.getByIndex(0));
        linko.printAll();
        linko.addToIndex(9, 8);
        linko.addToIndex(0, "q");
        System.out.println("After add to index");
        linko.printAll();
    }
}
