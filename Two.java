class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class Two
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Expected output: [7,0,8]
        
        // Example 2
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        
        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Expected output: [0]
        
        // Example 3
        l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        
        l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        
        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Expected output: [8,9,9,9,0,0,0,1]
    }
    
    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
