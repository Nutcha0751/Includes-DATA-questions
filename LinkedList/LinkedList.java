package LinkedList;

public class LinkedList {
    Node head;
    public void pushFront(String key){
        Node node = new Node(key);
        if(head == null){
            head = node; //ให้ head = node ใหม่ที่สร้างขึ้นมา
        }else{
            node.next = head;
            head = node;
        }
    };

    public void printHead2Tail(){
        Node current = head;
        while(current != null){
            System.out.println(current.key + ", ");
            current = current.next;
        };
        System.out.println("");
    };
}
