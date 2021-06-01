package shopee;

import java.util.HashMap;

public class LRUCache {
    public class LinkedNode{
        private int key;
        private int value;
        private LinkedNode prev, next;
        LinkedNode(){}
        LinkedNode(int _key, int _value){
            key = _key;
            value = _value;
        }
    }

    private HashMap<Integer, LinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private LinkedNode head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            //将节点移动到头部
            moveToHead(cache.get(key));
            return cache.get(key).value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            LinkedNode linkedNode = cache.get(key);
            linkedNode.value = value;
            moveToHead(linkedNode);
        }else {
            LinkedNode newNode = new LinkedNode(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            if(size < capacity){
                size++;
            }else{
                LinkedNode tailNode = removeTail();
                cache.remove(tailNode.key);
            }
        }
    }

    private void addToHead(LinkedNode linkedNode){
        linkedNode.next = head.next;
        head.next.prev =linkedNode;
        linkedNode.prev = head;
        head.next = linkedNode;

    }

    private LinkedNode removeTail(){
        LinkedNode linkedNode = tail.prev;
        removeNode(linkedNode);
        return linkedNode;
    }

    private void moveToHead(LinkedNode linkedNode){
        removeNode(linkedNode);
        addToHead(linkedNode);
    }

    private void removeNode(LinkedNode linkedNode){
        linkedNode.prev.next = linkedNode.next;
        linkedNode.next.prev = linkedNode.prev;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(3,3);
        cache.get(2);
        cache.put(4,4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }
}
