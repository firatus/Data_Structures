/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_3;

/**
 *
 * @author Tetar_
 */
public class Cosine_similarity {
    
    //İki array arasındaki benzerliği döndüren fonksiyon
    
    public static double vector_dot(double[] vec1, double[] vec2) {
        double sum = 0;
        for (int i = 0; i < vec1.length && i < vec2.length; i++)
            sum += vec1[i] * vec2[i];
        return sum;
    }
    public static double vector_norm(double[] vec) {
        double sum = 0;
        for (double v : vec)
            sum += v * v;
        return Math.sqrt(sum);
    }
    
    public static double cosine_similarity(double[] vec1, double[] vec2) {
        double cosim = vector_dot(vec1, vec2) / (vector_norm(vec1) * vector_norm(vec2));
        return cosim;
    }

    
}
