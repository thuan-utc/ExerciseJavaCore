package ExString;

import java.util.Scanner;

//•	Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//•	Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner((System.in));
        String s;
        char c;
        System.out.print("Nhap vao mot chuoi: ");
        s = scanner.nextLine();
        System.out.print("Nhap vao mot ki tu: ");
        c = scanner.nextLine().charAt(0);
        if (s.contains(c+""))
            System.out.println("\'"+ c +"\'" + " co xuat hien trong \"" + s+"\"");
        else
            System.out.println("\'"+ c +"\'" + " khong xuat hien trong \"" + s+"\"");
    }
}
