import java.util.*;
public class LRUCache {

    int cap ; 
    int size ; 
    DNode head ; 
    DNode tail ; 
    HashMap<Integer , DNode> hm ;

    public LRUCache(int cap){
        this.cap = cap ; 
        this.size= 0 ; 
        head = new DNode();
        tail = new DNode();
        head.next = tail; 
        tail.prev = head; 
        hm = new HashMap<>();
    }

    public void addToTail(DNode x){
        x.next = tail ; 
        x.prev = tail.prev;
        tail.prev.next = x ; 
        tail.prev = x;
    }

    public void remove(DNode x){
        x.prev.next = x.next ;
        x.next.prev = x.prev;
    }

    public void set(int key , int value){
        if(hm.containsKey(key)){
            // update the key 
            DNode node = hm.get(key);
            node.val = value; 
            // we will make it MRU (most recently used)
            // remove first and add 
            remove(node);
            addToTail(node);
        }else{
            DNode node = new DNode(key, value);
            if(size<cap){
                addToTail(node);
                size++;
            }else{ // size==cap (cache is full)
                // remove first to make space (both from hm and lru)
                hm.remove(head.next.key);
                remove(head.next);
                // then add
                addToTail(node);
            }
            hm.put(key,node);
        }
    }

    public int get(int key){
        if(hm.containsKey(key)){ 
            DNode reqNode = hm.get(key);
            remove(reqNode);
            addToTail(reqNode);
            return reqNode.val;
        }else{  
            return -1; 
        }
    }
}
