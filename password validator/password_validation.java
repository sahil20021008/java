import java.util.Scanner;

public class password_validation {
	static String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String small_chars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String symbols = "!@#$%^&*_=+-/.?<>)";

	public static boolean password_checker(String s) {
		int n=s.length();
		if(n<8||n>20) {
			return false;
		}
		boolean a = false,b = false,c = false,d = false;
		for(int i=0;i<n&&(a==false||b==false||c==false||d==false);i++) {
			if(capital_chars.contains(String.valueOf(s.charAt(i)))) {
				a=true;
			}
			if(small_chars.contains(String.valueOf(s.charAt(i)))) {
				b=true;
			}
			if(numbers.contains(String.valueOf(s.charAt(i)))){
				c=true;
			}
			if(symbols.contains(String.valueOf(s.charAt(i)))) {
				d=true;
			}
			if(Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return a&&b&&c&&d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the password to check if it is valid password or not");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		if(password_checker(s)) {
			System.out.println("This is a valid password");
		}else {
			System.out.println("This is not a valid Password");
		}
		scan.close();
	}

}
