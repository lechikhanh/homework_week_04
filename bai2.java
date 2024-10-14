package javademo;
import java.util.Scanner;
import java.util.ArrayList;

public class baitap8_10_bai2 {
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = sc.nextInt();
		ArrayList<Integer>arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu thu " + (i + 1) + ": ");
			int p = sc.nextInt();
			arr.add(p);
		}
		 ArrayList<Integer> positive = new ArrayList<>();
		 ArrayList<Integer> prime = new ArrayList<>();
	        for (int num : arr) {
	            if (num > 0) {
	                positive.add(num);
	            }
	        }
	        for (int num : arr) {
	            if (isPrime(num)) {
	                prime.add(num);
	            }
	        }
	        System.out.print("Cac so duong trong mang la: ");
	        for (int num : positive) {
	            System.out.print(num + " ");
	        }
	        System.out.print("Cac so nguyen to trong mang la: ");
	        boolean primeNumber = false;
	        for (int num : prime) {
	            System.out.print(num + " ");
	            primeNumber = true;
	        }
	        if (!primeNumber) {
	            System.out.println("khong co so nguyen to trong mang");
	        }
	      
	        sc.close();
	}
}

	
	
	

