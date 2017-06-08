
public class LinkedList<T> {

    int size;
    Node head;
    Node tail;

    boolean isEmpty(){
        return head == null;
    }

    T getByIndex(int index){
        Node temp = this.head;
        while (temp != null){
                if (temp.index == index){
                    return (T) temp.value;
                }
                temp = temp.next;
            }

        return null;
    }

    void addLast(T value){
        if (head == null){
            head = new Node(value);
            head.index = 0;
            tail = head;
        }
        else {
            tail.next = new Node(value, tail, null);
            tail.next.index = (tail.index+1);
            tail = tail.next;

        }
        size += 1;


//        head ->node1<- tail
//                head ->node1->node2<-tail


    }

    void addToIndex(int index, T value) {
        if (index<0) return;
        if (head != null) {
            Node temp = this.head;
            while (temp != null) {

                if (temp.next.index == index) {
                    Node nodeAdd = new Node(value);
                    temp.next.prev = nodeAdd;
                    nodeAdd.next = temp.next;
                    nodeAdd.prev = temp;
                    temp.next = nodeAdd;


                    temp = temp.next.next;
                    while (temp != null) {
                        temp.index += 1;
                        temp = temp.next;
                    }
                }
                if (temp != null) temp = temp.next;
            }
        }
    }

    void printAll(){
        Node temp = this.head;
        for (int i = 0; i < this.size; i++){
            System.out.println("["+temp.index+"]="+temp.value);
            if(temp.next != null){
                temp = temp.next;
            }
            else {
                return;
            }
        }
    }

    void removeByIndex(int index){
        Node temp = this.head;
        for (int i = 0; i < this.size; i++){
            if (temp != null ){
                if (temp.index == index){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                if (temp.index > index){
                    temp.index -=1;
                }
                temp = temp.next;
            }
        }
    }


    void removeByValue(T value){

        Node temp = this.head;

        while (temp != null ){
            if (temp.value == value){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    boolean contains(T value){

        Node temp = this.head;
            while (temp != null ){
                if (temp.value == value){
                    return true;
                }
                temp = temp.next;
            }
        return false;
    }
}
