public class class2LL2 {
    
    public static Node getMiddleOfLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow = head , fast = head ; 
        while(fast.next!=null && fast.next.next!=null){
            fast= fast.next.next; 
            slow = slow.next;
        }
        return slow;
    }
    
    public static Node mergeTwoSortedLL(Node head1 , Node head2){
        if(head1==null || head2==null){
            return head1 == null ? head2 : head1 ;
        }
        Node p1 = head1 , p2 = head2 ; 
        Node head = new Node();
        if(p1.val<p2.val){
            head = p1;
            p1 = p1.next;
        }else{
            head = p2 ; 
            p2 = p2.next;
        }
        Node temp = head ; 
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                temp.next = p1;
                temp = temp.next;
                p1 = p1.next;
            }else{                
                temp.next = p2;
                temp = temp.next;
                p2 = p2.next;
            }
        }
        if(p1!=null){
            temp.next = p2;
        }
        if(p2!=null){
            temp.next = p1;
        }
        return head;

    }
    
    public static Node mergeSortedLL(Node head){
        if(head==null || head.next==null) return head ;
        Node mid = getMiddleOfLL(head); 
        Node head2 = mid.next; 
        mid.next = null ; 
        Node sortedList1 = mergeSortedLL(head);
        Node sortedList2 = mergeSortedLL(head2);
        return mergeTwoSortedLL(sortedList1, sortedList2);
    }

    public static boolean checkForLoop(Node head){
        Node slow = head , fast = head ; 
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next ; 
            slow = slow.next ; 
            if(fast==slow){
                return true;
            }
        }
        return false ; 
    }

    public static void main(String[]args){

    }
}
