package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadaj cislo ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Postupnost cisel je: ");
        int n1 = 1;
        int n2 = 1;
        int prem;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < n-2; i++)
        {
            prem = n2;
            n2 = n1 + n2;
            n1 = prem;
            System.out.println(n2);
        }


        }

        }