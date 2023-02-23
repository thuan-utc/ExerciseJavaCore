package ExArray;

import ExCondition.IsNumber;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//•	Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
public class Ex14 {
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
        int []a = new int[n];

        // nhap mang n phan tu
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
        System.out.println("Mang ban nhap vao: ");
        for (int x:a)   System.out.print(x + " ");
        System.out.println();
        System.out.println("Mang sap xep nguoc lai: ");
        Collections.reverse(Arrays.asList(a));
        for(int x:a) System.out.print(x + " ");
    }
}
