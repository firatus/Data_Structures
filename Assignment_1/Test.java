package Assignment;

public class Test {

    public static void main(String[] args) {

        LinkedList my_list = new LinkedList();

        int[] datas = { 8, 2, 4, 4, 16, 2, 16, 8, 8, 32, 2, 64, 16, 64, 32, 16, 16, 32, 64, 8, 4, 2, 2, 2, 64, 32, 16, 8, 8, 4, 8}; 
        int[] columns = { 1, 2, 3, 4, 5, 2, 5, 1, 1, 2, 3, 3, 4, 2, 3, 1, 5, 3, 2, 4, 4, 4, 4, 2, 3, 3, 3,3,3,2,2};

  
        int number_1 = 1;
        int number_2 = 2;
        int number_3 = 3;
        int number_4 = 4;
        int number_5 = 5;



        boolean bir = false;
        boolean iki = false;

        boolean uc = false;

        boolean dort = false;

        boolean bes = false;

       

        for (int i = 0; i < datas.length; i++) {
            
            System.out.println("Eklenen sayi: " + datas[i] + " " + "Eklenen sutun: " + columns[i]);
            if(i == 0) {

                my_list.Add_Col_First(datas[i], columns[i]);
                if(columns[i] == number_1) {
                    bir = true;
                }
                else if(columns[i] == number_2) {
                    iki = true;
                }
                else if(columns[i] == number_3) {
                    uc = true;
                }
                else if(columns[i] == number_4) {
                    dort = true;
                }
                else if(columns[i] == number_5) {
                    bes = true;
                }

                
            }

            else
            {
                if((!bir))
                {
                    my_list.Add_Col(datas[i], columns[i]);
                    bir = true;
                }
                else if((!iki))
                {
                    my_list.Add_Col(datas[i], columns[i]);
                    iki = true;
                }
                else if(!(uc))
                {
                    my_list.Add_Col(datas[i], columns[i]);
                    uc = true;
                }
                else if(!(dort))
                {
                    my_list.Add_Col(datas[i], columns[i]);
                    dort = true;
                }
                else if(!(bes))
                {
                    my_list.Add_Col(datas[i], columns[i]);
                    bes = true;
                }
                else
                {
                    my_list.Add_Row(datas[i], columns[i]);
                }
            }
            

            
            my_list.print();
            System.out.println("--------------------------------------------------");
        }

        


       

        
    }

}
