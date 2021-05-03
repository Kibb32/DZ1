package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double Panels , Panel_size_A , Panel_size_B ;
        double result;пше фвв *

        Scanner input = new Scanner(System.in);

        System.out.println("Подсчет колличества сульфида для панелей");

        System.out.print("Введите количество панелей: ");
        Panels = input.nextDouble();
        System.out.print("Введите длинну панели: ");
        Panel_size_A = input.nextDouble();
        System.out.print("Введите ширину панели: ");
        Panel_size_B = input.nextDouble();

        result = Panels * Panel_size_A * Panel_size_B * 2;
        System.out.println("Необходимо: " + result + " сульфида ");

    }
}
