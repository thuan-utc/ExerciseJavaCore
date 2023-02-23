package ExArray;

import ExCondition.IsNumber;

import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//•	Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        // nhap vao n
        System.out.print("Nhap vao mot so nguyen n(n>0): ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)<0))
        {
            System.out.print("Nhap lai so nguyen n(n>0): ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        int []a = new int[n+1];
        double sum = 0;
        // nhap mang n phan tu
        for (int i = 0; i < n;i++)
        {
            System.out.print("Nhap a[" + i + "]: ");
            s = scanner.nextLine(); s = s.trim();
            while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)>20))
            {
                System.out.print("Nhap lai a[" + i + "]: ");
                s = scanner.nextLine(); s = s.trim();
            }
            a[i] = Integer.parseInt(s);
            sum += a[i];
        }
        System.out.printf("Trung binh cong cua mang tren: %.2f",(sum/n));
    }
}
