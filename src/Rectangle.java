public class Rectangle {
    private int length;
    private int width;

    // Constructor 0 tham số
    public Rectangle() {
        this.length = 8;
        this.width = 5;
    }

    // Constructor 2 tham số
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Setter cho chiều dài
    public void setLength(int length) {
        this.length = length;
    }

    // Getter cho chiều dài
    public int getLength() {
        return length;
    }

    // Setter cho chiều rộng
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter cho chiều rộng
    public int getWidth() {
        return width;
    }

    // Phương thức vẽ hình chữ nhật đặc
    public void drawSolidRectangle() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Phương thức vẽ hình chữ nhật rỗng
    public void drawHollowRectangle() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Phương thức tính chu vi hình chữ nhật
    public int getPerimeter() {
        return 2 * (length + width);
    }

    // Phương thức tính diện tích hình chữ nhật
    public int getArea() {
        return length * width;
    }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(10, 6);
            System.out.println("Chieu dai: " + rectangle.getLength());
            System.out.println("Chieu rong: " + rectangle.getWidth());
            System.out.println("Hinh chu nhat dac:");
            rectangle.drawSolidRectangle();
            System.out.println("Hinh chu nhat rong:");
            rectangle.drawHollowRectangle();
            System.out.println("Chu vi: " + rectangle.getPerimeter());
            System.out.println("Dien tich: " + rectangle.getArea());
    }
    
}