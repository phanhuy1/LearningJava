package Basic;
import java.util.Scanner;
/**
 * IntelliJ IDEA
 * User: gohuy
 * Package: Basic
 * Created by Phan Huy
 * Date 11/2/2022 - 8:09 PM
 * Description: ...
 */
public class BaiTap22 {
    class recursion {
        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d) {
                data = d;
                next = null;
            }
        }
        //reverse
        static Node reverse(Node head) {
            if (head == null || head.next == null)
                return head;

            Node rest = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return rest;
        }

        //print
        static void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        //add head
        static void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }

        public static void main(String args[]) {
            int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input data of node(stop: input -1): ");
            n = scanner.nextInt();
            while(n != -1) {
                push(n);
                System.out.println("Input data of node(stop: input -1): ");
                n = scanner.nextInt();
            }

            System.out.println("Given linked list");
            print();
            head = reverse(head);
            System.out.println("Reversed linked list");
            print();
        }
    }
}
