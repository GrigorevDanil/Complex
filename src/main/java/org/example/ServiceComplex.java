package org.example;

public class ServiceComplex {
    public String str(Complex complex)
    {
        return complex.getX() + " + " + complex.getY() + "i";
    }

    public Complex add(Complex complex1, Complex complex2)
    {
        return new Complex(complex1.getX() + complex2.getX(), complex1.getY() + complex2.getY() );
    }

    public  Complex sub(Complex complex1, Complex complex2)
    {
        return new Complex ( complex1.getX() - complex2.getX(), complex1.getY() - complex2.getY());
    }

    public Complex mul(Complex complex1, Complex complex2)
    {
        return new Complex(complex1.getX() * complex2.getX() - complex1.getY() * complex2.getY(), complex1.getX() * complex2.getY() + complex2.getX() * complex1.getY());
    }

    public Complex div(Complex complex1, Complex complex2)
    {
        try {
            if (complex1.getX() == 0 || complex2.getX() == 0) throw new Exception("На ноль делить нельзя!");
            double divisor = complex2.getX() * complex2.getX() + complex2.getY() * complex2.getY();
            return new Complex (complex1.getX() * complex2.getX() + complex1.getY() * complex2.getY() / divisor, (complex1.getY() * complex2.getX() - complex1.getX() * complex2.getY()) / divisor);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return new Complex(0,0);
    }


    public double module(Complex complex)
    {
        return Math.sqrt(Math.pow(complex.getX(),2) + Math.pow(complex.getY(),2));
    }

    public boolean equals(Complex complex1, Complex complex2) {
        if (complex1.getX() == complex2.getX() && complex1.getY() == complex2.getY()) return true;
        else return  false;
    }





}
