package bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "우리은행";
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
	}

	public String today(){
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		 today = sdf.format(date);
		return today;
	}
	public String generatorAccountNum(){
		String accountNum = "";
		Random random =new Random();

		for (int i = 0; i < 8; i++) {
			if (i != 3) {
				accountNum += random.nextInt(10);
			}else{
				accountNum += random.nextInt(10)+"-";
			}	
		}
		return accountNum;
	}
	public String deposit(int deposit){
		String res = "";
		if(deposit >= 0){
			money += deposit;
			res = deposit+"원이 입금되었습니다.";
		}else{
			res = "입금액이 잘못되었습니다.";
		}
		return res;
	}
	public String withdrawal(int withdrawal){
		String res ="";
		if(withdrawal > money){
			res ="출금액이 잘못되었습니다.";
		}else{
			money -= withdrawal;
			res = withdrawal+"원 출금되었습니다.";
		}
		return res;
	}
	public String info(String name){
		String info = "";
		return String.format("[계좌정보]\n"
				+ "은행명: %s\n"
				+ "계좌번호: %s\n"
				+ "이름: %s\n"
				+ "개설날짜: %s\n"
				+ "잔액: %s ",BANK_NAME,accountNum,name,today,money);
	}
}
