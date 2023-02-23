package EXLoop;

import ExCondition.IsNumber;

import java.util.Scanner;
//•	Viết chương trình cho phép nhập vào một số nguyên dương n,
//  tính tổng tất cả số chẵn	 trong khoảng từ 0 - n.
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Nhap vao mot so nguyen duong n(n>0): ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s) || s.equals("0")){
            System.out.print("Nhap lai so nguyen duong n(n>0) = ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        int mySum = 0;
        for (int i = 2; i < n; i+=2)
        {
            mySum += i;
        }
        System.out.print("Tong cac so chan thuoc khoang (0;" + n + ") la: " + mySum);
    }
}
