public class Insertion_In_LL {
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

    private static Node InsertToHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }

    private static Node InsertToTail(Node head, int val){
        if (head == null) return new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node ele = new Node(val);
        temp.next = ele;
        return head;
    }

    private static Node InsertToKthPosition(Node head, int pos, int k){
        if (head == null) {
            Node New = new Node(k);
            head = New;
            return head;
        }
        if (pos == 1){
            Node New = new Node(k, head);
            return New;
        }
        Node temp = head;
        int count = 1;
        while(temp != null){
            if (count == pos-1){
                Node New = new Node(k, temp.next);
                temp.next = New;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }

    private static Node InsertByValue(Node head, int val, int k){
        if (head == null) {
            return null;
        }
        if (val == head.data){
            return new Node(k, head);
        }

        Node temp = head;
        while(temp.next != null){
            if (val == temp.next.data){
                Node New = new Node(k, temp.next);
                temp.next = New;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,3};
        Node head = ArrayToLL(arr);
//        head = InsertToHead(head, 11);
//        head = InsertToTail(head, 11);
//        head = InsertToKthPosition(head, 4, 6);
        head = InsertByValue(head, 3, 6);

        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
