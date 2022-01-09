import java.util.Scanner;

public class password_strength {
	
	static String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String small_chars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String symbols = "!@#$%^&*_=+-/.?<>)";
    
	public static String strength(String s) {
		int ans=0;
		int n=s.length();
		boolean a = false,b = false,c = false,d = false;
		if(n>=8) {
			ans++;
		}
		for(int i=0;i<n;i++) {
			if(capital_chars.contains(s.substring(i, i+1))) {
				a=true;
			}
			if(small_chars.contains(s.substring(i, i+1))) {
				b=true;
			}
			if(numbers.contains(s.substring(i, i+1))) {
				c=true;
			}
			if(symbols.contains(s.substring(i, i+1))) {
				d=true;
			}
			if(a && b && c && d) {
				break;
			}
		}
		if(a) {
			ans++;
		}
		if(b) {
			ans++;
		}
		if(c) {
			ans++;
		}
		if(d) {
			ans++;
		}
		switch (ans) {
		case 1:
			return "weak";
		case 2:
			return "moderate";
		case 3:
			return "strong";
		case 4:
			return "very strong";
		case 5:
			return "excellent";
		default:
			return "very weak";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter password to find it's strength:");
		String s=scan.nextLine();
		System.out.println("Your password strength is "+strength(s));
		scan.close();
	}

}
