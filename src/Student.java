import java.util.Scanner;

public class Student {
    private String name;
    private double mathScore;
    private double literatureScore;

    public Student(String name, double mathScore, double literatureScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(double literatureScore) {
        this.literatureScore = literatureScore;
    }

    public double getAverageScore() {
        return (mathScore + literatureScore) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap diem toan: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Nhap diem van: ");
        double literatureScore = scanner.nextDouble();

        Student student = new Student(name, mathScore, literatureScore);

        System.out.println("Diem trung binh cua " + student.name + " la: " + student.getAverageScore());

        scanner.close();
    }
}
