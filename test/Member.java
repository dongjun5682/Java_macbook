package test;

public class Member {
	String name; //멤버 변수
	double a ;
	public String bmi(String[] arr){
		String bmi = "";//지역변수 -> 로컬변수
		double h = Double.parseDouble(arr[0]);
		double w = Double.parseDouble(arr[1]);
	
		double bm = w/((h*h)/10000);
		if(bm > 40){
			bmi = "고도비만입니다.";
		}else if(bm >= 35){
			bmi = "2단계 비만입니다.";
		}else if(bm >= 30){
			bmi = "1단계 비만입니다.";
		}else if(bm >= 25){
			bmi = "과체중 입니다.";
		}else if(bm > 18.5){
			bmi = "보통 입니다.";
		}else {
			bmi = "저체중입니다.";
		}
		return String.format("체중은  %s. ",bmi);
	} //bmi end
	public String grade(String[] scores){
		String grade = "";
		/*국어,영어,수학,과학,사회 과목 점수를 입력 받아서 평균을 낸뒤
		100~90 A, B, C, D, E, F 를 내는것
		*/
		int num1 = Integer.parseInt(scores[0]);
		int num2 = Integer.parseInt(scores[1]);
		int num3 = Integer.parseInt(scores[2]);
		int num4 = Integer.parseInt(scores[3]);
		int num5 = Integer.parseInt(scores[4]);
		int avg = (num1+num2+num3+num4+num5) /5;
		if(avg > 90){
			grade = "A학점입니다.";
		}else if(avg > 80){
			grade = "B학점입니다.";
		}else if(avg > 70){
			grade = "C학점입니다.";
		}else if(avg > 60){
			grade = "D학점입니다.";
		}else if(avg > 50){
			grade = "E학점입니다.";
		}else if(avg < 50){
			grade = "F학점입니다.";
		}else if(avg < 0 || avg >100){
			grade = "0~100사이에 점수를 입력해주세요.";
		}
		
		
		
		return grade;
	}
	
	public String genderChecker(String number){
		String checker = "";
		char ch =number.charAt(7);
		
		if(ch == '1' || ch == '3'){
			checker = "남자";
		}else if(ch == '2' || ch == '4'){
			checker = "여자";
		}else if(ch == '5' || ch == '6'){
			checker = "외국인";
		}else if(ch == '0' || ch == '7' || ch == '8' || ch == '9'){
			checker = "잘못입력하셨습니다.";
		}
		return checker;
	}
	
	
}