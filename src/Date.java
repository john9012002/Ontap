import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFormattedDate() {
        return String.format("%d-%d-%d", day, month, year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = scanner.nextInt();

        System.out.print("Nhap thang: ");
        int month = scanner.nextInt();

        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();

        Date date = new Date(day, month, year);

        System.out.println("Ngay " + date.getFormattedDate());

        scanner.close();
    }
}