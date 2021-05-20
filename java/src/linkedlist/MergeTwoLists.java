package linkedlist;

public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null){
            return l2;
        }
        if(l2 == null && l1 != null){
            return l1;
        }
        ListNode resultList = new ListNode();
        ListNode header = resultList;
//        header = resultList;
        while(l1!= null && l2 != null){

            if(l1.val < l2.val){
                resultList.next = l1;
                l1 = l1.next;
            }else{
                resultList.next = l2;
                l2 = l2.next;
            }
            resultList = resultList.next;
        }

        while(l1 != null){
            resultList.next = l1;
            l1 = l1.next;
            resultList = resultList.next;
        }
        while(l2 != null){
            resultList.next = l2;
            l2 = l2.next;
            resultList = resultList.next;
        }

        return header.next;
    }

    public void test(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        mergeTwoLists(l1,l2);
    }

    public static void main(String[] args) {
        MergeTwoLists a = new MergeTwoLists();
        a.test();

    }
}
