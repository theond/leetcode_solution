package baseStruct;

public class LinkedList {
    public int value;
    public LinkedList next;
    public LinkedList(int value){
        this.value = value;
        this.next = null;
    }

    //递归
    public LinkedList recReverse(LinkedList head){
        if(head == null || head.next == null){
            return head;
        }
        LinkedList currNode = head.next;
        LinkedList newHead = recReverse(head.next);
        head = currNode.next;
        //指向null，处理原头节点
        head.next = null;
        return newHead;
    }

    //迭代
    public LinkedList iteReverse(LinkedList head){

        LinkedList pre = null;
        for(;head != null && head.next != null;){
            LinkedList nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
