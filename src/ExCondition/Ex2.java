package ExCondition;
//•	Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
//        •	VD: 1 -> Một, 2 -> Hai, …

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Nhap vao mot so nguyen n = ");// em chi tinh la nhap tu 1 den 9
        s = scanner.nextLine(); s = s.trim();
        while (!IsNumber.isInteger(s)){
            System.out.print("Nhap lai so nguyen n = ");
            s = scanner.nextLine(); s = s.trim();
        }
        int n = Integer.parseInt(s);
        switch (n){
            case 1:
                System.out.print("Một");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bốn");
                break;
            case 5:
                System.out.print("Năm");
                break;
            case 6:
                System.out.print("Sáu");
                break;
            case 7:
                System.out.print("Bảy");
                break;
            case 8:
                System.out.print("Tám");
                break;
            case 9:
                System.out.print("Chín");
                break;
            default:
                System.out.print("Xin lỗi! Chương trình chỉ đọc được các số nguyên thuộc [1;9]");
                break;
        }
    }
}
