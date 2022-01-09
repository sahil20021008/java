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
    	String s="";
    	Random random=new Random();
    	int n=random.nextInt(12) + 8;
    	s+=String.valueOf(capital_chars.charAt(random.nextInt(capital_chars.length())));
    	s+=String.valueOf(small_chars.charAt(random.nextInt(small_chars.length())));
    	s+=String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
    	s+=String.valueOf(symbols.charAt(random.nextInt(symbols.length())));
    	for(int i=0;i<n-4;i++) {
    		s+=String.valueOf(values.charAt(random.nextInt(values.length())));
    	}
    	ArrayList<String>se=new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		se.add(s.substring(i, i+1));
    	}
    	Collections.shuffle(se);
    	s="";
    	for(int i=0;i<n;i++) {
    		s+=se.get(i);
    	}
    	System.out.println(s);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A Strong password is:");
		strong_password_generator();
	}

}
