package EXLoop;
//•	Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//        •	In ra tất cả số nguyên tố trong khoảng từ 0 - n.

import ExCondition.IsNumber;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Nhap vao mot so nguyen n(n<1000): ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)>1000))
        {
            System.out.print("Nhap lai so nguyen n(n<1000): ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        if (n<2)    System.out.print("Khong co so nguyen to nao be hon " + n);
        else
        {
            System.out.print("Cac so nguyen to thuoc [0;" + n + "] la: ");
            boolean []laNguyenTo = new boolean[n+1];
            for (int i = 2; i <= n;i++)
            {
                laNguyenTo[i] = true;
            }
            for (int i = 2; i <= n; i++)
            {
                if (laNguyenTo[i])
                {
                    for (int j = i*i; j<=n; j+=i)
                    {
                        laNguyenTo[j] = false;
                    }
                }
            }
            for (int i = 2; i <= n; i++)
            {
                if (laNguyenTo[i])
                    System.out.print(i + " ");
            }
        }
    }
}
