public class Delete_Middle_Node {
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

    private static Node RemoveMiddleNode(Node head){
        if(head.next == null) return null;

        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        int mid = count/2;
        temp = head;
        count = 0;

        while(count != mid-1){
            count++;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp = null;

        return head;
    }

    private static Node RemoveMiddleNodeLL(Node head){
        if(head.next == null) return null;

        Node slow = head;
        Node fast = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = null;
        slow.next = slow.next.next;
        slow = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,6,8};
        Node head = ArrayToLL(arr);

//        Brute force: O(N + N/2) Time complexity
//        head = RemoveMiddleNode(head);

//        Optimal Approach: O(N) Time complexity
        head = RemoveMiddleNodeLL(head);

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
