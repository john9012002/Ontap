import java.util.Scanner;

public class DrawShapes{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap chieu cao can ve: ");
        int height=scanner.nextInt();
        //Ve hinh tam giac
        System.out.println("Hinh tam giac vuong rong:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == height || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Vẽ hình vuông rỗng
        System.out.println("Hinh vuong rong:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height || j == 1 || j == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}