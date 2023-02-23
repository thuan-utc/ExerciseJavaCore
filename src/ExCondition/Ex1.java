package ExCondition;

import java.util.Scanner;

/* •	Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên,
        in ra màn hình “Đây là số nguyên dương” nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0,
        ngược lại in ra “Đây là số nguyên âm”.
*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Nhap vao 1 so nguyen n = ");
        s = scanner.nextLine(); s = s.trim();
        while (!IsNumber.isInteger(s)){
            System.out.print("Nhap lai so nguyen n = ");
            s = scanner.nextLine(); s= s.trim();
        }
        int n = Integer.parseInt(s);
        if (n == 0)     System.out.println(n + " khong la so nguyen am, khong la so nguyen duong");
        else if (n < 0) System.out.println(n + " la so nguyen am");
        else            System.out.println(n + " la so nguyen duong");
    }
}
