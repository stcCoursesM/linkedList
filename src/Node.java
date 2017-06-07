
public class Node<T> {

    int index;
    Node prev;
    Node next;
    T value;

    Node(T value){
        this.index = 0;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    Node(T value, Node prev, Node next){
        this.value = value;
        this.prev = prev;
        this.next = next;
    }


}
