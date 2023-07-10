import java.util.Scanner;

public class StudentManagement {
    private String id;
    private String name;
    private double score;

    public StudentManagement(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        if (score >= 8) {
            return "Gioi";
        } else if (score >= 7 && score < 8) {
            return "Kha";
        } else if (score >= 5 && score < 7) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String id = scanner.nextLine();

        System.out.print("Nhap ho ten sinh vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhap diem sinh vien: ");
        double score = scanner.nextDouble();

        StudentManagement student = new StudentManagement(id, name, score);

        System.out.println("Thong tin sinh vien:");
        System.out.println("Ma sinh vien: " + student.getId());
        System.out.println("Ho ten sinh vien: " + student.getName());
        System.out.println("Diem sinh vien: " + student.getScore());
        System.out.println("Xep loai sinh vien: " + student.getGrade());

        scanner.close();
    }
}