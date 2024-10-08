public class Problem1 {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

//        Adding data in linked list, Complexity O(N)
        for (int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12,5,8,7};
        Node head = convertArr2LL(arr);

//        Traverse in LinkedList O(N)
        Node temp = head;
//        Number of element in LinkedList
        int count = 0;
        int k = 5;
        while (temp!=null){
            System.out.print(temp.data + " ");
//            Search Element in LinkedList
//            if (k == temp.data) {
//                System.out.println("Yes K is present in the LinkedList");
//                break;
//            }
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.print(count);
    }
}
