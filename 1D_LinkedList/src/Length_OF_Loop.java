import java.util.HashMap;
import java.util.Map;

public class Length_OF_Loop {
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

    private static void len_of_loop(Node head){
        Node temp = head;
        int count = 1;
        Map<Node, Integer> mpp = new HashMap<>();

        while (temp != null){  // O(N)
            if (mpp.containsKey(temp)){  // O(log N) map time complexity
                count = count - mpp.get(temp);
                System.out.println("len of loop is: " + count);
                return;
            }

            mpp.put(temp, count);
            temp = temp.next;
            count++;
        }
        System.out.println(0);

//        Complexity:
//        Time: O(N logN)
//        Space: O(N)
    }

    private static void lenOfLoop(Node slow){
        Node temp = slow;
        slow = slow.next;
        int count = 1;

        while (temp != slow){
            slow = slow.next;
            count++;
        }
        temp = null;
        slow = null;
        System.out.println(count);
    }
    private static void Length_Of_Loop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                fast = null;
                lenOfLoop(slow);
                slow = null;
                return;
            }
        }

        System.out.println(0);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,3};
        Node head = ArrayToLL(arr);

//        Brute force:
//        len_of_loop(head);

//        Optimal Approach:
        Length_Of_Loop(head);
    }
}
