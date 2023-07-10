import java.util.Scanner;

public class DrawShapes1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua hinh: ");
        int height = scanner.nextInt();

        // Vẽ hình tam giác
        System.out.println("Hinh tam giac:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Vẽ hình vuông
        System.out.println("Hinh vuong:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
