import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number : ");
			int num = sc.nextInt();
			
			int n = num;
			int rev = 0;
			
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n = n /10;
				
			}

			if(num == rev) {
				System.out.println("Palindrome number");
			}else {
				System.out.println("Not a Palindrome Number");
			}
		}
	}
}
