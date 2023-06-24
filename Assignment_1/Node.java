package Assignment;

public class Node {

    int data;
    Node col_next;
    Node row_next;
    int col_info;

    Node(int data,int col)
    {
        this.data = data;
        this.col_next = null;
        this.row_next = null;
        this.col_info = col;

    }

    
}
