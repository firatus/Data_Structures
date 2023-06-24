package Assignment;

public class My_test2 {

    public static void main(String[] args) {

        LinkedList my_list = new LinkedList();

        int[] datas = { 2, 2, 4, 2, 4, 2, 4, 8, 8, 32, 2, 64, 16, 64, 32, 16, 16, 32, 64, 8, 4, 2, 2, 2, 64, 32, 16, 8, 8, 4, 8};

        int[] columns = { 1, 4, 2, 3, 5, 2, 5, 1, 1, 2, 3, 3, 4, 2, 3, 1, 5, 3, 2, 4, 4, 4, 4, 2, 3, 3, 3,3,3,2,2};
        
        my_list.Add_Col_First(2, 1);
        my_list.Add_Col(2, 2);
        my_list.Add_Col(7,4);

        my_list.Add_Col(4,4);

        my_list.Add_Row(3, 2);
        my_list.Add_Row(5, 1);
        
        

        my_list.print();
    }
}
