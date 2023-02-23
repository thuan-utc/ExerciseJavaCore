package ExCondition;

import java.util.Scanner;
//•	Viết chương trình cho phép nhập vào 3 số thực
//  Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double []a = new Double[3];
        String s;
        char edge = 'a';
        for (int i = 0; i < 3; i++){
            System.out.print("Nhap so thuc "+ (char)(edge+i) +" = ");
            s = scanner.nextLine(); s = s.trim();
            while(!IsNumber.isDouble(s))
            {
                System.out.print("Nhap lai so thuc "+ (char)(edge+i) +" = ");
                s = scanner.nextLine(); s= s.trim();
            }
            a[i] = Double.parseDouble(s);
        }
        if (a[0]+a[1]>a[2] && a[0]+a[2]>a[1] && a[1]+a[2]>a[0])
            System.out.println("Ba so " + a[0] + ", " + a[1] + ", " + a[2] + " la 3 canh cua mot tam giac!");
        else
            System.out.println("Ba so " + a[0] + ", " + a[1] + ", " + a[2] + " khong la 3 canh cua mot tam giac!");

    }
}
