/**
 * Remove Dups! Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * Hints: #9, #40
 */

public class Q2_01_Remove_Dups {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.appenToTail(7);
        node.appenToTail(7);
        node.appenToTail(5);
        node.appenToTail(4);
        node.appenToTail(4);
        node.appenToTail(4);
        node.appenToTail(9);
        removeDuplicates(node);
        Node temp = node;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static void removeDuplicates(Node node) {
        if (node == null) return;

        // 指针 current 迭代访问整个链表
        // 指针 runner 用于检查后续的节点是否重复
        Node current = node;
        Node runner;
        while (current != null) {
            runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
