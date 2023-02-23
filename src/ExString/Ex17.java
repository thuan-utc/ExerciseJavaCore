package ExString;

import java.util.Scanner;

//•	Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//•	Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//•	Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi,
//  nếu không thì in ra “Không tồn tại trong chuỗi”.
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner((System.in));
        String s;
        char c;
        System.out.print("Nhap vao mot chuoi: ");
        s = scanner.nextLine();
        System.out.print("Nhap vao mot ki tu: ");
        c = scanner.nextLine().charAt(0);
        int i = s.indexOf(c);
        if (i == -1)
            System.out.print("Khong ton tai trong chuoi");
        else
        {
            System.out.print("Vi tri trong chuoi: ");
            while (i!=-1)
            {
                System.out.print(i + "; ");
                i = s.indexOf(c,i+1);
            }
        }
    }
}
