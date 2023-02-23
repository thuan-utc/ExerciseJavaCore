package ExCondition;
//•	Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//  Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//  Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)


import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "B\\d{7}"; // "B[0-9]{7}"
        String s;
        System.out.print("Nhap vao ma sinh vien (Bxxxxxxx): ");
        s = scanner.nextLine(); s = s.trim();
        if (s.matches(regex))
            System.out.println("Chuoi hop le");
        else
            System.out.println("Chuoi khong hop le");
    }
}
