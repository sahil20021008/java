import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class strong_password {
	static String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String small_chars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String symbols = "!@#$%^&*_=+-/.?<>)";
    static String values = capital_chars + small_chars + numbers + symbols;

    public static void strong_password_generator() {
    	ArrayList<String>se=new ArrayList<>();
    	Random random=new Random();
    	int n=random.nextInt(12) + 8;
    	se.add(String.valueOf(capital_chars.charAt(random.nextInt(capital_chars.length()))));
    	se.add(String.valueOf(small_chars.charAt(random.nextInt(small_chars.length()))));
    	se.add(String.valueOf(numbers.charAt(random.nextInt(numbers.length()))));
    	se.add(String.valueOf(symbols.charAt(random.nextInt(symbols.length()))));
    	for(int i=0;i<n-4;i++) {
    		se.add(String.valueOf(values.charAt(random.nextInt(values.length()))));
    	}
    	Collections.shuffle(se);
    	for(int i=0;i<n;i++) {
    		System.out.print(se.get(i));
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A Strong password is:");
		strong_password_generator();
	}

}
