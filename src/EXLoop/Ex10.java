package EXLoop;

import java.util.Scanner;

//•	Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//•	Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
//•	Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9.
//  (Sử dụng biểu thức chính quy để ràng buộc định dạng)
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String []s = new String[5];
        String check = "B170[1-9]{4}";
        System.out.println("Nhap vao 5 ma sinh vien: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Ma sinh vien thu " + (i+1) + ": ");
            s[i] = scanner.nextLine(); s[i] = s[i].trim();
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(s[i] + " ");
            if (s[i].matches(check))
                System.out.print("hop le\n");
            else
                System.out.print("khong hop le\n");

        }

    }
}
