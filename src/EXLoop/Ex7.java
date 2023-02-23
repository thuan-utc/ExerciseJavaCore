package EXLoop;

import ExCondition.IsNumber;

import java.util.Scanner;

//•	Viết chương trình để nhập nhập một số nguyên,
//  tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Nhap vao mot so nguyen n: ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s)){
            System.out.print("Nhap lai so nguyen duong n = ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        long myProduct = n;
        for (int i = 2; i <= 20; i++)
        {
                myProduct*=i;
        }
        System.out.print("Tich cua " + n + " voi cac so tu 1-20 la " + myProduct);
    }
}
