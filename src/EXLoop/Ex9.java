package EXLoop;

import ExCondition.IsNumber;

import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.
//•	Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
//•	Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
//•	Ta có ví dụ: Fi(2) = Fi(0) + Fi(1) = 1+1 = 2, Fi(3) =Fi(2) + Fi(1) = 2+1 = 3,
//  Fi(4) = Fi(3) + Fi(2) = 3+2 = 5, … Giả sử n = 4, đầu ra sẽ là 5.
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Nhap vao mot so nguyen n(n<=20): ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)>20))
        {
            System.out.print("Nhap lai so nguyen n(n<=20): ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        System.out.print("So Fibonacci ung voi " + n + " la: ");
        if (n<0)    System.out.print("khong co");
        else {
            int []fibo = new int[n+1];
            fibo[0] = fibo[1] = 1;
            for (int i = 2; i <= n; i++)
            {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            System.out.print("fibo[" + n+ "] = " + fibo[n]);
        }
    }
}
