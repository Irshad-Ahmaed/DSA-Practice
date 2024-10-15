import java.util.Stack;

public class Reverse_LL {
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

    private static Node Reverse_LL_Stack(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    private static Node Reverse_LL_Next(Node head){
        Node temp = head;
        Node prev = null;
        Node front = null;

        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    private static Node Reverse_LL_Recursive(Node head){

        if (head == null || head.next == null) return head;

        Node newHead = Reverse_LL_Recursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,3};
        Node head = ArrayToLL(arr);
//        head = Reverse_LL_Stack(head);
//        head = Reverse_LL_Next(head);
        head = Reverse_LL_Recursive(head);

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
