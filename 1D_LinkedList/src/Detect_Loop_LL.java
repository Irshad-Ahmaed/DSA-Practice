import java.util.HashMap;
import java.util.Map;

public class Detect_Loop_LL {
    private static Node ArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        System.out.println("Initial head: "+ head.data);
        return head;
    }

    private static void Detect_Loop(Node head){
        Node temp = head;
        Map<Node, Integer> nodeMap = new HashMap<>();

        while (temp != null) {

            if (nodeMap.containsKey(temp)) {
                System.out.println(true);
                return;
            }

            nodeMap.put(temp, 1);

            temp = temp.next;
        }

        System.out.println(false);
    }

    private static void Detect_Loop_2(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println(true);
                return;
            }
        }

//        Alternative 2x fast:

//        while(fast != null && fast.next != null && fast.next.next != null){
//            fast = fast.next.next.next;
//            slow = slow.next.next;
//            if(slow == fast) return true;
//        }

        System.out.println(false);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,3};
        Node head = ArrayToLL(arr);

//        HashMap Approach: Brute
//        Detect_Loop(head);

//        Tortoise Approach: Optimal
        Detect_Loop_2(head);
    }
}
