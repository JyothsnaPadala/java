package secretMessagedecoder;

import java.util.Scanner;

public class SecretMessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = scan.next().charAt(0);
	    SecretMessageDecoder secretMessageDecode = new SecretMessageDecoder();
	    System.out.println(secretMessageDecode.decodeCharacter(ch));
		
		
		

	}

}
