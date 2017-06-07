
public class LinkedList<T> {

    int size = 1;
    Node head;
    Node tail;



    boolean isEmpty(){
        return (head == null);
    }

    void addToIndex(int index, T value){

        Node prev = head;

        for(int i = 1; i <= index-1; i++){
            prev = prev.next;
        }

        Node after = prev.next;
        Node middle = new Node (value, after, prev);
        prev.next = middle;

        if (after == null)
            tail = middle;
        else
            after.prev = middle;

    }

    void addLast(T value){
        if (this.size == 0){
            size = 1;
            tail = new Node(value);
            head = tail;
        }

        Node temp = new Node(value);
        Node current = tail;

        if (this.size != 0) {

            tail.next = new Node(value, null, next);
            tail = tail.next;

            this.size += 1;
        }


    }

    void removeAtIndex(){

    }

    void removeValue(){

    }

    boolean contains(T value){

        for ( i < size next == true ){
            if (i.value){
                return true;
            }
        }
        return false;


    }

}
