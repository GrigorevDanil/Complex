package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceComplex service = new ServiceComplex();
        Complex complex1 = new Complex(5,5);
        Complex complex2 = new Complex(5,5);
        System.out.println("Комплексное число 1: " + service.str(complex1));
        System.out.println("Комплексное число 2: " + service.str(complex2));

        System.out.println("Сложение: " + service.str(service.add(complex1, complex2)));
        System.out.println("Разность: " + service.str(service.sub(complex1, complex2)));
        System.out.println("Умножение: " + service.str(service.mul(complex1, complex2)));
        System.out.println("Сравнение: " + service.equals(complex1, complex2));
        System.out.println("Модуль 1го числа: " + service.module(complex1));
        System.out.println("Модуль 2го числа: " + service.module(complex2));
        System.out.println("Разность: " +service.str(service.div(complex1,complex2)) );

    }
}