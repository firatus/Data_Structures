package Assignment_2;

import assignment_2.Assigment_2;
import java.util.Stack;

public class Binary_Tree {

    public Node root;

    public Binary_Tree() {
        root = null;
    }

    //Binary Tree'ye eleman ekleme
    public void insert(int value, String word) {

        Node newNode = new Node(value, word);

        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;

            while (temp != null) {

                if (value > temp.distance) {

                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }

                    temp = temp.right;

                } else if (value <= temp.distance) {

                    if (temp.left == null) {
                        temp.left = newNode;
                        return;
                    }

                    temp = temp.left;

                } else {
                    return;
                }

            }

        }

    }

    //Binary Tree'de minimum distance değerine sahip node döndürülür.
    public Node findMin() {

        Node temp = root;

        if (root == null) {
            System.out.println("Tree is empty!");
            return null;
        } else {
            while (temp.left != null) {
                temp = temp.left;
            }
        }

        return temp;
    }

    //Tüm binary tree'yi yazdırır.
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.distance + " " + node.word + " ");
            inorder(node.right);
        }
    }

    //  binary treede en düşük distance değerine sahip olan nodelar ayrı bir binary treede toplar.
    public Binary_Tree search() {

        Binary_Tree tree = new Binary_Tree();

        if (root == null) {
            System.out.println("Empty");
        } else {

            Node temp = root;

            while (temp != null) {
                Node min = findMin();

                if (temp.distance == min.distance) {
                    tree.insert(temp.distance, temp.word);
                }
                temp = temp.left;

            }

        }

        return tree;

    }

    //Root node'dan başlayarak her node'un soldaki node'unu yazdırır.
    public void print() {
        Node temp = root;

        if (root == null) {
            System.out.println("Tree is empty!");
        } else {
            while (temp.left != null) {
                System.out.println(temp.word);
                temp = temp.left;
            }
        }

    }

}
