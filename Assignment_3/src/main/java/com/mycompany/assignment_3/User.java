/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_3;

/**
 *
 * @author Tetar_
 */
public class User {
    
    public int user_id;
    public double similarity_rate; 
    
    public double[] votes;

    public User(int user_id,double[] votes,double similarity_rate) {
        this.user_id = user_id;
        this.votes = votes;
        this.similarity_rate = similarity_rate;
    }
    
    
    
    
    
    
    
}
