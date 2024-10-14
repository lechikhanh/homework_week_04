package javademo;
import java.util.Scanner;

public class baitap8_10 {
	public static void main(String[] args) {
		int a, b;
		System.out.println("Menu");
		System.out.print("Nhap hai so a, b: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("lua chon phep tinh: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.print("Press: ");
        int Press = sc.nextInt();
        switch (Press) {
        case 1: 
    		int cong = a + b;
    		System.out.println("ket qua: " + cong);
    		break;
        case 2:
    		int tru = a - b;
    		System.out.println("ket qua: " + tru);
			break;
        case 3:
    		int nhan = a * b;
    		System.out.println("ket qua: " + nhan);
			break;
        case 4:
        	if (b != 0) {
                double chia = (double) a / b;
                System.out.println("ket qua: " + chia);
			break;
            } else {
                System.out.println("Lỗi: Không thể chia cho 0!");
            }
            break;
        default:
            System.out.println("vui long chon cac lua chon tu 1 den 4");
            break;
        }
        sc.close();
	}
}
