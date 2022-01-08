import java.util.*;

public class random_otp_generator {

	public static void main(String[] args) {
		Random random=new Random();
		String s="";
		for(int i=0;i<6;i++){
			s+=String.valueOf(random.nextInt(10));
		}
		System.out.println("Your 6-digit random OTP is: "+s);
	}
}
