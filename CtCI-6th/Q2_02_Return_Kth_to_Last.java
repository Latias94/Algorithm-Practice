/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 * Hints:#8, #25, #41, #67, #126
 */

public class Q2_02_Return_Kth_to_Last {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.appenToTail(6);
        node.appenToTail(7);
        node.appenToTail(5);
        node.appenToTail(4);
        node.appenToTail(10);
        node.appenToTail(3);
        node.appenToTail(9);
        System.out.println(returnKthtoLast(node, 3).data);
    }

    // 时间复杂度O(n), 空间复杂度O(1)
    static Node returnKthtoLast(Node node, int k) {
        if (node == null) return null;

        // 使用间隔为 k 的双指针
        // 指针 current 迭代访问整个链表
        // 指针 runner 用于检查 current 前 k 个Node
        Node current = node;
        Node runner = null;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
            if (count == k) {
                runner = node;
            } else if (count > k) {
                runner = runner.next;
            }
        }

        if (count < k) {
            return null;
        }

        return runner;
    }
}
