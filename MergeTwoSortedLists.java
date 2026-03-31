package com.leetcode.linkedlist;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        c.next = null;
        b.next = c;
        a.next = b;

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);
        f.next = null;
        e.next = f;
        d.next = e;

        ListNode result = mergeTwoLists(a, d);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        ListNode curr1 = list1, curr2 = list2;

        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                temp.next = curr1;
                curr1 = curr1.next;
            } else {
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }

        // Point the remaining nodes of the non-empty list to the merged list
        if (curr1 != null) temp.next = curr1;
        if (curr2 != null) temp.next = curr2;

        return dummyNode.next;
    }
}
