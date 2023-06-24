package com.mycompany.assignment_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class read_csv {

    public static void main(String[] args) throws IOException {



    }
    
    //target_user.csv adlı dosyadan bulunan user_id değerlerini ArrayList'te tutan değer.
    public static ArrayList get_target_user() throws IOException {

        ArrayList<String> users = new ArrayList<String>();

        // combo box'a doldur
        String csvFile = "D:/Data Structers/Linkey/src/Assignment_3/read_csv/src/target_user.csv"; // CSV dosyasının
        // yolu ve adı
        String line;
        // CSV dosyasındaki sütunları ayırmak için kullanılan karakter
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        br.readLine();// ilk satırı atla
        while ((line = br.readLine()) != null) {
            String[] row = line.split(",");

            String firstColumn = row[0];
            users.add((firstColumn));

        }
        return users;
    }
    
    //target_user.csv adlı dosyadan bulunan seçilen user_id'li kullanıcının oylarını arrayde tutan fonksiyon.

    public static double[] target_user_votes(int index) throws IOException {

        double[] votes = new double[9017];

        String csvFile = "D:/Data Structers/Linkey/src/Assignment_3/read_csv/src/target_user.csv"; // CSV dosyasının
        // yolu

        String line;
        int line_count = 0;

        // CSV dosyasındaki sütunları ayırmak için kullanılan karakter
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();// ilk satırı atla

            int arr_index = 0;
            while ((line = br.readLine()) != null && index < votes.length) {
                String[] values = line.split(",");
                if (line_count == index) {
                    for (int columnIndex = 1; columnIndex < 9018 && columnIndex < values.length; columnIndex++) {
                        votes[arr_index] = Double.parseDouble(values[columnIndex]);
                        arr_index++;
                    }
                }
                line_count++;

            }

        }
        return votes;

    }

    
    //main_data.csv adlı dosyada bulunan her bir kullanıcının verdiği oyları bir dizi olarak saklayarak tüm dizileri içeren matrisi döndüren fonksiyon.
    public static double[][] main_data_votes() throws IOException {

        int rows = 600;
        int columns = 9018;
        double[][] all_data = new double[rows][columns];

        String csvFile = "D:/Data Structers/Linkey/src/Assignment_3/read_csv/src/main_data.csv"; // CSV dosyasının yolu

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // İlk satırı atlamak için
            br.readLine();

            int rowIndex = 0;
            while ((line = br.readLine()) != null && rowIndex < rows) {
                String[] values = line.split(",");
                for (int columnIndex = 1; columnIndex < columns + 1 && columnIndex < values.length; columnIndex++) {
                    all_data[rowIndex][columnIndex - 1] = Double.parseDouble(values[columnIndex]);
                }
                rowIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return all_data;

    }
    //Film ismine göre film id değerini döndüren fonksiyon
    public static int get_movie_id(String movie_name) {
        String csvFile = "D:/Data Structers/Linkey/src/Assignment_3/read_csv/src/movies.csv"; // CSV dosyasının yolu

        String line;
        int id = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // İlk satırı atlamak için
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] movie_list = line.split(",");
                String movie = movie_list[1].replaceAll("\\s", "");
                if (movie.equals(movie_name)) {
                    id = Integer.parseInt(movie_list[0]);
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;

    }
    
    //Tüm film isimlerini arrayde tutan fonksiyon
    public static String[] get_all_movies() {
        String csvFile = "D:/Data Structers/Linkey/src/Assignment_3/read_csv/src/movies.csv"; // CSV dosyasının yolu

        String[] movies = new String[5401];

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // İlk satırı atlamak için
            br.readLine();
            int index = 0;
            while ((line = br.readLine()) != null) {
                
                String[] movie_list = line.split(",");
                movies[index] = movie_list[1];
                index++;
              
            }
        } catch (IOException e) {
        }

        return movies;

    }

}
