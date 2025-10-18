public class testRantangle1_3 {
    public static void main(String[] args) {
        // Kiểm tra các hàm tạo và toString()
        // Bạn cần thêm 'f' hoặc 'F' vào một ký tự float
        Rectangle1_3 r1 = new Rectangle1_3(1.2f, 3.4f);
        System.out.println(r1);   // toString()
        Rectangle1_3 r2 = new Rectangle1_3();   // hàm tạo mặc định
        System.out.println(r2);

        // Các bộ thiết lập và bộ lấy thử nghiệm
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);   // toString()
        System.out.println("chiều dài là: " + r1.getLength());
        System.out.println("chiều rộng là: " + r1.getWidth());

        // Kiểm tra getArea() và getPerimeter()
        System.out.printf("diện tích là: %.2f%n", r1.getArea());
        System.out.printf("chu vi là: %.2f%n", r1.getPerimeter());
    }
}
