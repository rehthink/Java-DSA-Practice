package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //Reverse Using Recursion
    public Node reverse(Node node){
        if (node == tail){
            head = tail;
            return node;
        }

        Node newHead = reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

        return newHead;
    }

    //Reverse Iteratively
    //https://leetcode.com/problems/reverse-linked-list/description/

    public Node reverseIt(Node head) {

        if (head == null) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next =next.next;
            }
        }
        head = prev;
        return head;
    }

    //https://leetcode.com/problems/reverse-linked-list-ii/description/
    public Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left-1 ; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node next = current.next;
        for (int i = 0; current != null && i < right-left+1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        return head;
    }
    //Duplicates
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //Insert using Recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index,head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    //Merge Two Sorted Linked List
    public  static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
               ans.insertFirst(f.value);
               f = f.next;
            }else {
                ans.insertFirst(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertFirst(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertFirst(s.value);
            s = s.next;
        }

        return ans;
    }

    //Middle Element of Linked List
    public void middleElement() {

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }

        System.out.println("END");
    }

    public int deleteLast() {
        if (size<=1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(9);
        list.display();


        list.reverse(list.head);
        list.reverseBetween(list.head,1,3);
        //list.reverseIt();
        list.display();
    }
}
