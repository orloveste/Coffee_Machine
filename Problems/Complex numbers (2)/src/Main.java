class Complex {

    double real;
    double image;

    public void add(Complex number) {
        this.real = this.real + number.real;
        this.image = this.image + number.image;
    }

    void subtract(Complex number) {
        this.real = this.real - number.real;
        this.image = this.image - number.image;
    }
/*
    public static void main(String[] args) {
        Complex number = new Complex();
        number.real = 10;
        number.image = 4;

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;

        number.add(anotherNumber);

    }*/
}
//Compilation error
//Main.java:12: error: cannot find symbol
//        complex.image = scanner.nextDouble();
//               ^
//  symbol:   variable image
//  location: variable complex of type Complex
//Main.java:16: error: cannot find symbol
//        other.image = scanner.nextDouble();
//             ^
//  symbol:   variable image
//  location: variable other of type Complex
//Main.java:24: error: cannot find symbol
//        System.out.println(complex.real + " " + complex.image);
//                                                       ^
//  symbol:   variable image
//  location: variable complex of type Complex
//3 errors

//Failed test #2 of 2. Wrong answer
