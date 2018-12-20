package test;

public class MyCalendar {
	public String leapYear(String year){
		String res = "";
		//윤년
		int y = Integer.parseInt(year);
		if((y%4 == 0 && y%100 != 0) || y%400 == 0) {
			res = "윤년입니다.";
		}else {
			res = "평년입니다.";
		}
		return res;
	}
}