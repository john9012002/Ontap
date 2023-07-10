import java.util.Scanner;

public class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double inchToCm(double inch) {
        return inch * 2.54;
    }

    public static double cmToInch(double cm) {
        return cm / 2.54;
    }

    public static double feetToMeter(double feet) {
        return feet / 3.281;
    }

    public static double meterToFeet(double meter) {
        return meter * 3.281;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long chon loai chuyen doi:");
        System.out.println("1. Do C sang F");
        System.out.println("2. Do F sang C");
        System.out.println("3. Inch sang Cm");
        System.out.println("4. Cm sang Inch");
        System.out.println("5. Feet sang Meter");
        System.out.println("6. Meter sang Feet");
        System.out.print("Lua chon cua ban: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap do C: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("Do F: " + fahrenheit);
                break;
            case 2:
                System.out.print("Nhap do F: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                System.out.println("Do C: " + celsiusOutput);
                break;
            case 3:
                System.out.print("Nhap gia tri inch: ");
                double inch = scanner.nextDouble();
                double cm = inchToCm(inch);
                System.out.println("Gia tri cm: " + cm);
                break;
            case 4:
                System.out.print("Nhap gia tri cm: ");
                double cmInput = scanner.nextDouble();
                double inchOutput = cmToInch(cmInput);
                System.out.println("Gia tri  inch: " + inchOutput);
                break;
            case 5:
                System.out.print("Nhap gia tri feet: ");
                double feet = scanner.nextDouble();
                double meter = feetToMeter(feet);
                System.out.println("Gia tri Meter: " + meter);
                break;
            case 6:
                System.out.print("Nhap gia triMeter: ");
                double meterInput = scanner.nextDouble();
                double feetOutput = meterToFeet(meterInput);
                System.out.println("Gia tri Feet: " + feetOutput);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }

        scanner.close();
    }
}

