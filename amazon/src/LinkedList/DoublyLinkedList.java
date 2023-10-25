package LinkedList;
import java.util.LinkedList;
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Append an element to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Prepend an element to the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Delete an element with a specific value
    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
            }
            current = current.next;
        }
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Display the elements of the list from head to tail
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display the elements of the list from tail to head
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.prepend(0);

        System.out.println("Forward:");
        dll.displayForward();

        System.out.println("Backward:");
        dll.displayBackward();

        dll.delete(2);

        System.out.println("Forward after deleting 2:");
        dll.displayForward();

        System.out.println("Size: " + dll.size());
    }
}
