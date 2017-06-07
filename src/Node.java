
public class Node<T> {

    T value;
    int index;
    Node prev;
    Node next;


    Node(T value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    Node(T value, Node prev) {
        this.value = value;
        this.prev = prev;
        this.next = null;
    }

    Node(T value, Node prev, Node next){
        this.value = value;
        this.prev = prev;
        this.next = next;

    }



}
