package ExArray;
//•	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
// 	Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.

import ExCondition.IsNumber;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        // nhap vao n
        System.out.print("Nhap vao mot so nguyen n: ");
        s = scanner.nextLine(); s = s.trim();
        while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)<0))
        {
            System.out.print("Nhap lai so nguyen n: ");
            s = scanner.nextLine(); s = s.trim();
        }
        n = Integer.parseInt(s);
        int []a = new int[n+1];
        int min;
        // nhap mang n phan tu duong
        for (int i = 0; i < n;i++)
        {
            System.out.print("Nhap a[" + i + "]: ");
            s = scanner.nextLine(); s = s.trim();
            while(!IsNumber.isInteger(s))
            {
                System.out.print("Nhap lai a[" + i + "]: ");
                s = scanner.nextLine(); s = s.trim();
            }
            a[i] = Integer.parseInt(s);
        }
        //tim phan tu min
        min = a[0];
        for (int i = 1; i < n; i++)
        {
            if (a[i]<min)   min = a[i];
        }
        // in ra min
        System.out.println("Phan tu nho nhat trong mang: ");
        for (int i = 1; i < n; i++)
        {
            if (a[i]==min)
            System.out.printf("a[%d] = %d\n",i,a[i]);
        }
    }
}
