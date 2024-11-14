import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng các đối tượng Resizeable
        Resizable[] shapes = new Resizable[3];

        // Khởi tạo các đối tượng hình học
        shapes[0] = new Circle(5);  // Circle with radius 5
        shapes[1] = new Rectangle(4, 6);  // Rectangle with width 4 and height 6
        shapes[2] = new Square(4);  // Square with side 4

        Random rand = new Random();

        // Kiểm thử thay đổi kích thước cho các đối tượng
        for (Resizable shape : shapes) {
            // In ra diện tích ban đầu
            System.out.println("Before resizing: " + shape);

            // Thay đổi kích thước ngẫu nhiên từ 1-100%
            double randomPercent = 1 + rand.nextInt(100);  // random từ 1 đến 100
            System.out.println("Resizing by " + randomPercent + "%...");
            shape.resize(randomPercent);

            // In ra diện tích sau khi thay đổi kích thước
            System.out.println("After resizing: " + shape);
            System.out.println();
        }
    }
}