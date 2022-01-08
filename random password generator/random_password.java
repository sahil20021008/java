import java.util.*;

public class random_password {
	static String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String Small_chars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String symbols = "!@#$%^&*_=+-/.?<>)";
    static String values = Capital_chars + Small_chars + numbers + symbols;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		String password="";
		System.out.println("Enter the length of random password:");
		int n=Integer.parseInt(scan.nextLine());
		for(int i=0;i<n;i++) {
			password+=String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		System.out.println("Your random password of length "+n+" is: "+password);
		scan.close();
	}

}
