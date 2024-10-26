public class DNode {
    int val ; 
    int key ; 
    DNode prev;
    DNode next ;
    DNode(){

    }
    public DNode(int val){
        this.val = val ; 
        this.next = null ; 
        this.prev = null ;
    } 
    public DNode(int key , int val){
        this.val = val ; 
        this.next = null ; 
        this.prev = null ;
        this.key = key ;
    } 
    
}
