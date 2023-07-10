import java.util.Arrays;
import java.util.Scanner;

public class ArrayManagement {
    private int[] arr;

    public ArrayManagement(int n) {
        arr = new int[n];
    }

    public ArrayManagement() {
        arr = new int[5];
    }

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public void printArray() {
        System.out.println("Cac phan tu trong mang la: " + Arrays.toString(arr));
    }

    public int sumArray() {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public double averageArray() {
        return (double) sumArray() / arr.length;
    }

    public int[] modifyArray(int k) {
        int[] modifiedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                modifiedArr[i] = arr[i] + k;
            } else {
                modifiedArr[i] = arr[i] - k;
            }
        }

        return modifiedArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        ArrayManagement arrayManagement = new ArrayManagement(n);

        arrayManagement.inputArray();
        arrayManagement.printArray();
        System.out.println("Tong cac phan tu trong mang la: " + arrayManagement.sumArray());
        System.out.println("Gia tri trung binh cua cac phan tu trong mang la: " + arrayManagement.averageArray());

        System.out.print("Nhap gia tri k: ");
        int k = scanner.nextInt();

        int[] modifiedArr = arrayManagement.modifyArray(k);
        System.out.println("Mang sau khi duoc sua doi la: " + Arrays.toString(modifiedArr));

        scanner.close();
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}