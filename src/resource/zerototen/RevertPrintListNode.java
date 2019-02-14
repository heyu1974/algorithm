package resource.zerototen;

import java.util.List;

/**
 * auth:heyu
 * email:heyu.ambition@gmal.com
 * date:2019/02/14
 *
 *
 * 6. 从尾到头打印链表
 * NowCoder
 *
 * 题目描述
 * 从尾到头反过来打印出每个结点的值。
 *
 *
 *采用递归 遍历一次链表
 *
 **/
public class RevertPrintListNode {

    public static void foreach(ListNode listNode) {
        if (listNode.next!=null){
            foreach(listNode.next);
        }
        System.out.println(listNode.val);
    }


    static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(){}
        public ListNode(int a ){
            this.val = a;
        }
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(4);
        foreach(listNode);
    }
}
