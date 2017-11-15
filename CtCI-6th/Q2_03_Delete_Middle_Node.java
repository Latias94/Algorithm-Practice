/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 * Hints:#72
 * 这题太无语了...瞄了眼答案，输入的node就是中间的node...
 */

public class Q2_03_Delete_Middle_Node {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.appenToTail(6);
        node.appenToTail(7);
        node.appenToTail(5);
        node.appenToTail(4);
        node.appenToTail(10);
        node.appenToTail(3);
        node.appenToTail(8);
        Node middle = new Node(4);
        middle.appenToTail(10);
        middle.appenToTail(3);
        middle.appenToTail(8);
        deleteMiddleNode(middle);
        System.out.println(middle.data);
    }

    // 时间复杂度O(n), 空间复杂度O(1)
    static void deleteMiddleNode(Node node) {
        if (node == null || node.next == null) return;
        Node next = node.next;
        node.next = next.next;
        node.data = next.data;
    }
}
