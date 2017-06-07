
public class LinkedList<T> {

    int size;
    Node head;
    Node tail;

    boolean isEmpty(){
        return head == null;
    }

    T getByIndex(int index){
        Node temp = this.head;
        for (int i = 0; i < this.size; i++){
            if (temp.next != null ){
                if (temp.next.index == index){
                    return (T) temp.next.value;
                }
                temp = temp.next;
            }
        }
        return (T) temp.value;
    }

    void addLast(T value){
        if (head == null){
            head = new Node(value);
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

    void addToIndex(int index, T value){
        Node temp = this.head;
        for (int i = 0; i < this.size; i++){
            if (temp.next != null ) {

                if (temp.next.index == index) {
                    temp.next.value = value;
                }

                if (temp.index > index) {
                    temp.index += 1;
                }
                temp = temp.next;
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
        for (int i = 0; i < this.size; i++){
            if (temp.next != null ){
                if (temp.value == value){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;

                }
                temp = temp.next;
            }
        }

    }

    boolean contains(T value){

        Node temp = this.head;

        for (int i = 0; i < this.size; i++){
            if (temp.next != null ){
                if (temp.value == value){
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;

    }

}
