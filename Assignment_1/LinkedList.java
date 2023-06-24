package Assignment;

public class LinkedList {

    Node head;
    int col_size = 0;

    public LinkedList() {
        head = null;

    }

    // Add

    public void Add_Col_First(int data, int col_info) {

        Node tmp = new Node(data, col_info);

        if (head == null) {
            head = tmp;

        } else {
            tmp.col_next = head;
            head = tmp;

        }
        col_size++;

    }

    

    public void Add_Col(int new_data, int col_info) {

        Node tmp = head;
        Node newNode = new Node(new_data, col_info);

        while (tmp.col_next != null) {

            tmp = tmp.col_next;
        }

        newNode.col_next = tmp.col_next;
        tmp.col_next = newNode;
        col_size++;

    }

    public void Add_Row(int new_data, int col_info) {

        Node tmp = head;

        Node newNode = new Node(new_data, col_info);

        // Aradığımız columnu bulana kadar ilerliyoruz
        while (tmp != null) {

            if (tmp.col_info == col_info) {

                while (tmp.row_next != null) {
                    tmp = tmp.row_next;
                }
                if (tmp.data == new_data) {
                    tmp.data = new_data + tmp.data;
                }

                else {
                    newNode.row_next = tmp.row_next;
                    tmp.row_next = newNode;

                }

                // Aradığımız sütuna yeni satırı oluşturacak node ekliyoruz

                break;
            }

            tmp = tmp.col_next;

        }

    }

    
    public void print() {

        // sadece ilk sütunun satır nodearını yazdırıyor

        boolean first_row = true;
        Node tmp_col = head;

        for (int i = 1; i <= 7; i++) {
            Node tmp2 = head;
            

            for (int j = 1; j <= 5; j++) {

                

                if (first_row) {

                    

                    if (tmp_col.col_next == null && tmp_col.col_info == j) {
                        System.out.print("| " + tmp_col.data + " |");

                    }

                    else if (tmp_col.col_info == j) {
                        System.out.print("| " + tmp_col.data + " |");
                        tmp_col = tmp_col.col_next;

                    }

                    else {
                        System.out.print("| _ |");
                    }

                }

                else {
                    
                    
                    boolean typed = false;
                    if (tmp2.col_info == j) {


                        if (tmp2.row_next == null) {
                            System.out.print("| _ |");

                        } else 
                        {

                            Node tmp2_cp = tmp2;

                            for (int a = 1; a < i; a++) {

                                if (tmp2_cp.row_next != null)
                                {
                                    tmp2_cp = tmp2_cp.row_next;
                                    
                                } 
                                else {
                                    System.out.print("| _ |");
                                    typed = true;
                                    break;
                                }

                            }

                            if (!(typed)) {

                                System.out.print("| " + tmp2_cp.data + " |");
                                
                            }

                            
                            if (tmp2.col_next != null) {

                                tmp2 = tmp2.col_next;

                            }

                        }

                    }

                    else {
                        System.out.print("| _ |");

                    }

                }

            }

            System.out.println();

            first_row = false;
        }

    }

}
