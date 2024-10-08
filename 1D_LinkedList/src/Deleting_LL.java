public class Deleting_LL {
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

    private static Node delete_LL_Head(Node head){
        if (head == null) return head;
        head = head.next;
        return head;
    }

    private static Node delete_LL_Tail(Node head){
        if (head == null || head.next == null) return null;
        System.out.println("Initial head: " + head.data);
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deleteSpecificNode(Node head, int k){
        if (head == null) return head;
        if (k == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;
        int count =1;

        while (temp != null){
            if (count == k-1 && temp.next != null) {
                temp.next = temp.next.next;
                break;
            }
            else {
                temp = temp.next;
            }
            count++;
        }
        return head;
    }

    private static Node deleteNodeValue(Node head, int val){
        if (head == null) return head;
        if (head.data == val) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node previous = null;
        while (temp != null){
            if (temp.data == val) {
                previous.next = temp.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,3};
        Node head = ArrayToLL(arr);
//        head = delete_LL_Head(head);
//        head = delete_LL_Tail(head);
//        head = deleteSpecificNode(head, 4);
        head = deleteNodeValue(head, 7);
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
