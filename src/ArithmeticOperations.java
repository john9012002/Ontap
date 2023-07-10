import java.util.Scanner;

public class ArithmeticOperations {
    private int num1;
    private int num2;

    public ArithmeticOperations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

    public int modulus() {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations(num1, num2);

        System.out.println("Tong cua hai so la: " + arithmeticOperations.add());
        System.out.println("Hieu cua hai so la: " + arithmeticOperations.subtract());
        System.out.println("Tich cua hai so la: " + arithmeticOperations.multiply());
        System.out.println("Thuong cua hai so la: " + arithmeticOperations.divide());
        System.out.println("Phan du cua hai so la: " + arithmeticOperations.modulus());

        scanner.close();
    }
}