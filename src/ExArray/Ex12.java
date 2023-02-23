package ExArray;

import ExCondition.IsNumber;

import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//•	Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
public class Ex12 {
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
        int max = 0;
        // nhap mang n phan tu duong
        for (int i = 0; i < n;i++)
        {
            System.out.print("Nhap a[" + i + "](>0): ");
            s = scanner.nextLine(); s = s.trim();
            while(!IsNumber.isInteger(s) || (IsNumber.isInteger(s) && Integer.parseInt(s)<0))
            {
                System.out.print("Nhap lai a[" + i + "](>0): ");
                s = scanner.nextLine(); s = s.trim();
            }
            a[i] = Integer.parseInt(s);
            if (max < a[i]) max = a[i];
        }
        //in ra cac phan tu max
        System.out.println("Phan tu lon nhat trong mang: ");
        for (int i = 0; i < n; i++)
        {
            if (a[i] == max)
                System.out.printf("a[%d] = %d\n",i,a[i]);
        }

    }
}
