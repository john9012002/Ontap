public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor 0 tham số
    public Fraction() {
        this.numerator = 1;
        this.denominator = 2;
    }

    // Constructor 2 tham số
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Setter cho tử số
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Getter cho tử số
    public int getNumerator() {
        return numerator;
    }

    // Setter cho mẫu số
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Getter cho mẫu số
    public int getDenominator() {
        return denominator;
    }

    // Phương thức in phân số ra màn hình
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    // Phương thức cộng 2 phân số
    public Fraction add(Fraction other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức trừ 2 phân số
    public Fraction subtract(Fraction other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức nhân 2 phân số
    public Fraction multiply(Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức chia 2 phân số
    public Fraction divide(Fraction other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức rút gọn phân số
    public void simplify() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Phương thức tìm ước chung lớn nhất
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);

        System.out.print("Phan so 1: ");
        fraction1.printFraction();
        System.out.print("Phan so 2: ");
        fraction2.printFraction();

        Fraction sum = fraction1.add(fraction2);
        System.out.print("Tong: ");
        sum.printFraction();

        Fraction difference = fraction1.subtract(fraction2);
        System.out.print("Hieu: ");
        difference.printFraction();

        Fraction product = fraction1.multiply(fraction2);
        System.out.print("Tich: ");
        product.printFraction();

        Fraction quotient = fraction1.divide(fraction2);
        System.out.print("Thuong: ");
        quotient.printFraction();

        System.out.print("Phan so rut gon: ");
        fraction1.simplify();
        fraction1.printFraction();
    }
}