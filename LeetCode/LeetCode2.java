public class LeetCode2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(6);
        ListNode resp = ListNode.addTwoNumbers(l1, l2);
        while (resp != null) {
            System.out.println(resp.val);
            resp = resp.next;
        }
    }

    static class ListNode {
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

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode resposta = new ListNode(0);
            ListNode cabeca = resposta;
            int somaTotal = 0, a=0, b=0, c = 0;
            while(l1!=null||l2!=null||c!=0){
                a = l1==null?0:l1.val;
                b = l2==null?0:l2.val;
                somaTotal = a+b+c;
                c = somaTotal/10;
                cabeca.next = new ListNode(somaTotal%10);
                cabeca = cabeca.next;
                if(l1!=null) l1=l1.next;
                if(l2!=null) l2=l2.next;
            }
            return resposta.next;
        }
    }

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */