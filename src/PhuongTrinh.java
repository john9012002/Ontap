import java.util.Scanner;

public class PhuongTrinh {
    // Phương trình bậc nhất: ax + b = 0
    public static void GiaiPT() {
        System.out.println("Phuong trinh bac nhat: ax + b = 0");
        System.out.println("Nhap he so a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Nhap he so b: ");
        float b = new Scanner(System.in).nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh có vô số nghiệm");
            } else {
                System.out.println("Phuong trinh vô nghiệm");
            }
        } else {
            float x = -b / a;
            System.out.println("Phuong trinh có nghiệm x = " + x);
        }
    }
    
    // Phương trình bậc hai: ax^2 + bx + c = 0
    public static void GiaiPT(float a, float b) {
        System.out.println("Phuong trinh bac nhat: ax + b = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh có vô số nghiệm");
            } else {
                System.out.println("Phuong trinh vô nghiệm");
            }
        } else {
            float x = -b / a;
            System.out.println("Phuong trinh có nghiệm x = " + x);
        }
    }
    
    // Phương trình bậc hai: ax^2 + bx + c = 0
    public static void GiaiPT(float a, float b, float c) {
        System.out.println("Phuong trinh bậc hai: ax^2 + bx + c = 0");
        if (a == 0) {
            GiaiPT(b, c);
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vô nghiệm");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Phuong trinh có nghiệm kép x = " + x);
            } else {
                float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
    public static void main(String[] args) {
        // Giải phương trình bậc nhất: 2x + 3 = 0
        PhuongTrinh.GiaiPT(2, 3);
        
        // Giải phương trình bậc hai: x^2 - 5x + 6 = 0
        PhuongTrinh.GiaiPT(1, -5, 6);
    }
}