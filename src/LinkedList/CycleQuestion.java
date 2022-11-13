package LinkedList;

public class CycleQuestion {

    public static void main(String[] args) {

    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if(head == null) return false;

        while(fast.next != null ) {
            if(fast.next.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;

            if(slow ==  fast)  return true;
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast.next != null && fast != null ) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow ==  fast){
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    //Middle Element
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
