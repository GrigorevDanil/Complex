package org.example;

public class ServiceComplex {
    public String str(Complex complex)
    {
        return complex.getX() + " + " + complex.getY() + "i";
    }

    public String add(Complex complex1, Complex complex2)
    {
        return (complex1.getX() + complex2.getX()) + " + " + (complex1.getY() + complex2.getY()) + "i";
    }

    public  String sub(Complex complex1, Complex complex2)
    {
        return (complex1.getX() - complex2.getX()) + " + " + (complex1.getY() - complex2.getY()) + "i";
    }

    public String mul(Complex complex1, Complex complex2)
    {
        return (complex1.getX() * complex2.getX() - complex1.getY() * complex2.getY()) + " + " + (complex1.getX() * complex2.getY() + complex2.getX() * complex1.getY()) + "i";
    }

    public String div(Complex complex1, Complex complex2)
    {
        if (complex1.getX() == 0 || complex2.getX() == 0) return "На ноль делить нельзя!";
        int divisor = complex2.getX() * complex2.getX() + complex2.getY() * complex2.getY();
        return ((complex1.getX() * complex2.getX() + complex1.getY() * complex2.getY()) / divisor) + " + " + ((complex1.getY() * complex2.getX() - complex1.getX() * complex2.getY()) / divisor) + "i";
    }


    public int module(Complex complex)
    {
        return (int) Math.sqrt(Math.pow(complex.getX(),2) + Math.pow(complex.getY(),2));
    }

    public boolean equals(Complex complex1, Complex complex2) {
        if (complex1.getX() == complex2.getX() && complex1.getY() == complex2.getY()) return true;
        else return  false;
    }





}
