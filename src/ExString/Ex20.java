package ExString;

import java.util.Scanner;

//•	Viết chương trình cho phép người dùng nhập vào 1 chuỗi, kiểm tra chuỗi này có phù hợp với yêu cầu hay không.
//•	Nếu có thì in ra “Duyệt!”, ngược lại in ra “Không duyệt”.
//•	Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự, không được chứa ký tự khoảng trắng,
//  bắt đầu bằng một ký tự chữ viết hoa (A - Z), kết thúc bằng một số (0 - 9).
//  (Sử dụng biểu thức chính quy để ràng buộc định dạng)
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner((System.in));
        String s;
        System.out.print("Nhap vao mot chuoi: ");
        s = scanner.nextLine();
        String check1 = ".*\\S+.*";
        String check2 = "^[A-Z].*\\d$";
        if (s.length()<=20 && s.matches(check1) && s.matches(check2))
            System.out.println("Duyệt!");
        else
            System.out.println("Không duyệt!");
    }
}
