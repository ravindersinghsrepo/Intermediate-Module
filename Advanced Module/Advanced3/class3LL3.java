public class class3LL3 {

    public static DNode insertAtHeadOfDLL(DNode head , int val){
        DNode nn = new DNode(val); 
        nn.next =  head ; 
        head.prev = nn ; 
        head = nn;
        return head ; 
    }

    public static DNode insertNodeAtIdxOfDLL(DNode head , int idx , int val){
        DNode nn = new DNode(val);
        if(idx==0){
            return insertAtHeadOfDLL(head, val);
        }
        DNode temp = new DNode();
        temp = head ; 
        for(int i = 1 ; i < idx ;i++){
            temp = temp.next ; 
        }

        if(temp.next!=null){
            nn.next = temp.next ; 
            temp.next.prev = nn ; 
        }
        temp.next = nn ; 
        nn.prev = temp;

        return head ; 
    }
    
    public static DNode deleteNodeOfDLL(DNode head , int target){
        DNode temp = head ; 
        while(temp!=null){
            if(temp.val==target){
                break;
            }
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Value to be deleted doesnot exists in the list");
            return head ;
        }
        if(temp.prev==null && temp.next==null){ // single node case 
            return null ;
        }else if(temp.prev==null && temp.next!=null){ // deletion at 0th idx 
            head = head.next ;
            head.prev.next = null ; 
        }else if (temp.next==null){ // deletion at the last index 
            temp.prev.next = null ; 
            temp.prev = null ; 
        }else{ // deletion in somewhere middle 
            temp.prev.next = temp.next ; 
            temp.next.prev = temp.prev ; 
        }
        return head ; 
    }

    public static void main(String [] args){

    }
}
