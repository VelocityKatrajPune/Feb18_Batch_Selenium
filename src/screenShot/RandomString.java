package screenShot;

public class RandomString {

	public static void main(String[] args) {
		
		
		String myString = net.bytebuddy.utility.RandomString.make(4);//0-9a-zA-Z

		System.out.println(myString);
	}

}
