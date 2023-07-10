public class Triangle {
    private int height;

    // Constructor 0 tham số
    public Triangle() {
        this.height = 5;
    }

    // Constructor 1 tham số
    public Triangle(int height) {
        this.height = height;
    }

    // Setter cho chiều cao
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter cho chiều cao
    public int getHeight() {
        return height;
    }

    // Phương thức vẽ hình tam giác vuông đặc
    public void drawSolidRightTriangle() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Phương thức vẽ hình tam giác vuông rỗng
    public void drawHollowRightTriangle() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == height - 1 || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Phương thức tính diện tích hình tam giác
    public double getArea() {
        return 0.5 * height * height;
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7);
        System.out.println("Chieu cao: " + triangle.getHeight());
        System.out.println("Hinh tam giac vuong dac:");
        triangle.drawSolidRightTriangle();
        System.out.println("Hinh tam giac vuong rong:");
        triangle.drawHollowRightTriangle();
        System.out.println("Dien tich: " + triangle.getArea());
    }
}