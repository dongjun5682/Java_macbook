package test;

public class Calc {
	public String plus(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a+b);
		return res;
	}
	public String minus(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a-b);
		return res;
	}
	public String multi(String[] calc){
		String res ="";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a*b);
		return res;
	}
	public String divid(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a/b);
		return res;
	}
	public String percent(String[] calc){
		String res = "";
		int a = Integer.parseInt(calc[0]);
		String op = calc[1];
		int b = Integer.parseInt(calc[2]);
		res =a+op+b+"="+(a%b);
		return res;
	}
	public String gugudan(String dan){
		String res = "";
		int a = Integer.parseInt(dan);
		
		if(a < 0 || a > 10) {
			 res = "2단에서 9단 밖에없습니다.";
		}
		for (int i = 1; i < 10; i++) {
			res += dan+"*"+i+"="+(a*i)+"\n";
		}
		return res;
	}
}