/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class bankAccount {
    String AccountNumber;
    ArrayList<Information> account = new ArrayList<Information>();
    bankAccount()
    {
    }
    void Inputaccount()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of account: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            Information p = new Information();
            p.InputInformation();
            account.add(p);
        }
    }
    void Outputaccount()
    {
        for(int i=0;i<account.size();i++){
            account.get(i).OutputInformation();
        }
    }
    
}
