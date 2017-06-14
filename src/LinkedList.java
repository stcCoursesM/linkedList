
public class LinkedList<T> {

    int size;
    Node head, tail;

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
            head = tail = new Node(value);
            head.index = 0;
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
        if (index < 0 || index >= size){
            System.out.println("Index mustn't be less than 0!");
            return;
        }
        Node temp = head;
        if (index == 0){
            head.prev = new Node(value, null, head);
            head = head.prev;
            size += 1;

            temp = head.next;
            while (temp != null) {
                temp.index += 1;
                temp = temp.next;
            }

            return;
        }
        if (head != null) {
            while (temp != null) {

                if (temp.next.index == index) {
                    Node nodeAdd = new Node(value);
                    temp.next.prev = nodeAdd;
                    nodeAdd.next = temp.next;
                    nodeAdd.prev = temp;
                    temp.next = nodeAdd;
                    size += 1;

                    temp = temp.next.next;
                    while (temp != null) {
                        temp.index += 1;
                        temp = temp.next;
                    }
                }
                if (temp != null) temp = temp.next;
            }
        }else {
            addLast(value);
            size += 1;
        }
    }

    void printAll(){
        Node temp = this.head;
        while (temp != null) {
            System.out.println("["+temp.index+"]="+temp.value);
            temp = temp.next;
        }
    }

    void removeByIndex(int index){
        if (index < 0){
            System.out.println("Index mustn't be less than 0!");
            return;
        }
        if (index > tail.index){
            System.out.println("There is no such element with that index");
            return;
        }
        if (index == 0){
            head = head.next;
            head.prev = null;
            Node temp = head;
            size -= 1;
            while (temp != null) {
                temp.index -=1;
                temp = temp.next;
            }
            return;
        }
        if (index == tail.index){
            tail = tail.prev;
            size -= 1;
            return;
        }
        Node temp = this.head;
        while (temp != null) {

                if (temp.index == index){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    size -= 1;
                    while (temp != null) {
                        temp.index -=1;
                        temp = temp.next;
                    }
                }
                if (temp != null) temp = temp.next;
            }
    }


    void removeByValue(T value){
        if (size < 1){
            System.out.println("There is no elements in the list");
            return;
        }
        Node temp = this.head;

        while (temp != null ){
            if (temp.value == value){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                size -=1;
                while (temp != null) {
                    temp.index -=1;
                    temp = temp.next;
                }
                return;
            }
            temp = temp.next;
        }
    }

    boolean contains(T value){
        if (size < 1){
            return false;
        }
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
