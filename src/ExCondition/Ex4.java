package ExCondition;

import java.util.Scanner;
//•	Viết chương trình cho phép nhập vào 3 số
//  Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double []a = new Double[3];
        String s;
        char edge = 'a';
        for (int i = 0; i < 3; i++){
            System.out.print("Nhap so thuc "+ (char)(edge+i) +" = ");
            s = scanner.nextLine(); s= s.trim();
            while(!IsNumber.isDouble(s))
            {
                System.out.print("Nhap lai so thuc "+ (char)(edge+i) +" = ");
                s = scanner.nextLine(); s= s.trim();
            }
            a[i] = Double.parseDouble(s);
        }
        if (a[0]+a[1]>a[2] && a[0]+a[2]>a[1] && a[1]+a[2]>a[0]){
            double c1, c2, c3;
            c1 = a[0]*a[0]; c2 = a[1]*a[1]; c3=a[2]*a[2];
            if (c1==c2+c3 || c2==c1+c3 || c3==c1+c2)
                System.out.println("Day la 3 canh cua mot tam giac vuong");
            else
                System.out.println("Day khong la 3 canh cua mot tam giac vuong");
        }
        else
            System.out.println("Day khong la 3 canh cua mot tam giac vuong");
    }
}
