import java.util.*;

public class class1LL1 {
 
    public static Node getNodeAtK(Node head , int k ){
        Node temp = head ; 
        for(int i = 1 ; i<=k ;i++){
            temp = temp.next ;
        }
        return temp ; // temp is at the kth node 
    }

    public static boolean searchNodeWithVal(Node head , int x){
        Node temp = head ; 
        while(temp!=null){
            if(temp.val==x){
                return true;
            }
            temp = temp.next ;
        }
        return false;
    }
    
    public static Node insertAtHead(Node head, int x){
        class1LL1 cl =new class1LL1();
        Node newNode = new Node(x);
        newNode.next = head ; 
        head = newNode ;
        return head;
    }
    
    public static Node insertAtKthIndex(Node head , int value , int idx){
        Node nn = new Node(value);
        Node temp = new Node();
        temp = head ;
        for(int i = 1 ; i < idx ; i++){
            temp = temp.next ;
        }
        nn.next = temp.next ; 
        temp.next= nn ;
        return head ;
    }
    
    public static Node insertAttheEnd(Node head , int value){
        Node temp = head ; 
        while(temp.next!=null){
            temp = temp.next ;
        }
        Node nn = new Node(value);
        temp.next = nn ; 
        nn.next = null ;
        return head ;
    }
    
    public static Node deleteHead(Node head){
        head= head.next ;
        return head;
    }
    
    public static Node deleteLastNode(Node head){
        if(head.next==null) return null ;
        Node temp = head ;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null ;
        return head;
    }
    
    public static Node deleteKthNode(Node head , int k){
        if(k==0){
            Node nhead = deleteHead(head);
            return nhead;
        }
        Node temp = head ;
        for(int i = 1 ; i < k ;k++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    
    public static Node reverseList(Node head){
        if(head.next==null || head==null){
            return head ;
        }
        Node prev = null , curr = head ; 
        while(curr!=null){
            Node next= curr.next ;
            curr.next = prev; 
            prev = curr; 
            curr = next ;
        }
        return prev;

    }
    public static void main(String args[]){

    }
}
