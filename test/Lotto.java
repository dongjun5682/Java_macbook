package test;

import java.util.Random;

public class Lotto {
	public String randomNum(){
		String num = "";
		Random random = new Random();
		int[] number = new int[6];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = random.nextInt(44)+1;
			num += number[i]+" ";
		}
		return num;
	}
}