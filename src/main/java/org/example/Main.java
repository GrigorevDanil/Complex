package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceComplex service = new ServiceComplex();
        Complex complex1 = new Complex(5,5);
        Complex complex2 = new Complex(5,5);
        System.out.println(service.str(complex1));
        System.out.println(service.add(complex1, complex2));
        System.out.println(service.sub(complex1, complex2));
        System.out.println(service.mul(complex1, complex2));

        System.out.println(service.equals(complex1, complex2));
        System.out.println(service.module(complex1));
        System.out.println(service.div(complex1,complex2));

    }
}