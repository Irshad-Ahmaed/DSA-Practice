public class Remove_Nth_Node_From_Last {

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

    private static Node removeNode(Node head, int n){
        if(head == null) return null;
        if(n==1 && head.next == null) return head.next;

        Node temp = head;
        // ListNode prev = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        if(count == n){
            return head.next;
        }

        int res = count-n;
        temp = head;
        count = 1;

        while(temp != null){
            // prev = temp;
            if(count == res ) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        temp = null;
        return head;
    }

    private static Node removeNodeFromBack(Node head, int n){
        if(head == null) return null;
        if(n==1 && head.next == null) return head.next;

        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        fast = null;
        slow = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,6,8};
        Node head = ArrayToLL(arr);

//        Brute Force:
//        Complexity: Time-O(2N), Space- O(1)
//        head = removeNode(head, 2);

//        Optimal Approach:
//        Time Complexity: O(N)
        head = removeNodeFromBack(head, 2);

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
