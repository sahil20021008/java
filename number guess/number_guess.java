import java.util.Random;
import java.util.Scanner;

public class number_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random r=new Random();
		int d=0;
		int n=r.nextInt(100)+1;
		for(;;) {
			d++;
			System.out.println("Guess a number between 1 and 100");
			int guess=Integer.parseInt(scan.nextLine());
			if(guess<n) {
				System.out.println("Wrong! The number is higher than "+guess);
			}else if (guess>n) {
				System.out.println("Wrong! The number is lower than "+guess);
			}else {
				System.out.println("Correct! The number is "+n);
				break;
			}
		}
		System.out.println("You have correctly guessed the number in "+d+" turns");
		scan.close();
	}
}
