package ExString;

import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
//•	Nếu có tin ra “Có”, ngược lại, in ra “Không”.
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner((System.in));
        String s;
        System.out.print("Nhap vao mot chuoi: ");
        s = scanner.nextLine();
        boolean check = false;
        for (char x : s.toCharArray())
        {
            if (Character.isDigit(x))
            {
                System.out.print("Có");
                check = true;
                break;
            }
        }
        if (!check)
            System.out.print("Không");
    }
}
