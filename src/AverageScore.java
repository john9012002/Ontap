import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap diem toan: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhap diem van: ");
        double literatureScore = scanner.nextDouble();

        double averageScore = (mathScore + literatureScore) / 2;

        System.out.println("Diem trung binh cua " + name + " la: " + averageScore);

        scanner.close();
    }
}
