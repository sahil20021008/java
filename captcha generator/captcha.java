import java.util.Random;
import java.util.Scanner;

public class captcha {
	static String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String small_chars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String values = capital_chars + small_chars + numbers;
    
	public static String captcha_generator(int length) {
		Random rand=new Random();
		String s="";
		for(int i=0;i<length;i++) {
			s+=String.valueOf(values.charAt(rand.nextInt(values.length())));
		}
		System.out.println(s);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=captcha_generator(9);
		System.out.println("Enter above captcha:");
		String se=scan.nextLine();
		if(s.compareTo(se)==0) {
			System.out.println("captcha matched");
		}else {
			System.out.println("Error: Incorrect captcha");
		}
		scan.close();
	}

}
