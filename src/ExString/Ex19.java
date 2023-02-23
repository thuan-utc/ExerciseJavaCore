package ExString;

import java.util.Scanner;

//•	Viết chương trình cho phép nhập vào một chuỗi
//•	Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//•	In ra số lần đó
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner((System.in));
        String s;
        System.out.print("Nhap vao mot chuoi: ");
        s = scanner.nextLine();
        int count = 0;
        int i = s.indexOf('a');
        while (i!=-1)
        {
            count++;
            i = s.indexOf('a',i+1);
        }
        System.out.println("\'a\' xuat hien trong \"" + s+"\" " + count + " lan");

    }
}
