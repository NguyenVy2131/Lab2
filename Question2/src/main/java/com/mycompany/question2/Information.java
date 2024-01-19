/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Information {
    int accNum;
    String name;
    int balance;
    Information() 
    {
    }
    Information(int accNum, String name, int balance)
    {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    
    void InputInformation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bank account number: ");
        accNum = sc.nextInt();
        System.out.print("Bank account name: ");
        name = sc.nextLine();
        System.out.print("Bank account balance: ");
        balance = sc.nextInt();
    }
    void OutputInformation()
    {
        System.out.println("Bank account number: "+accNum+" - Bank account name: "+name+" - Bank account balance: "+balance);
    }
}
