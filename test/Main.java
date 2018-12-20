package test;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while (true) {
			JOptionPane opt = new JOptionPane();
			Member m = new Member();
			Calc c = new Calc();
			Lotto l = new Lotto();
			MyCalendar y = new MyCalendar();
			String menu = JOptionPane.showInputDialog("0.종료\n1.회원관리\n2.계산기\n3.로또\n4.달력 ");
			switch (menu) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":

				String name = JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null, String.format("환영합니다. %s님", m.name));
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n 1.BMI(키,몸무게) \n 2.학점(국어,영어,수학,과학,사회) \n 3.성별체크(SSN)");
				switch (mMenu) {
				case "1":
					String[] arr = opt.showInputDialog(null, "키,몸무게 입력").split(",");
					opt.showMessageDialog(null,String.format("%s 님은 %s ",m.name,m.bmi(arr)));
					break;
				case "2":
					String[] scores = opt.showInputDialog(null, "국어,영어,수학,과학,사회 점수를 입력하세요.").split(",");
					opt.showMessageDialog(null,String.format("%s님의 학점 : %s",m.name ,m.grade(scores)));
					break;
				case "3":
					String number = opt.showInputDialog(null,"주민번호를 입력해주세요");
					opt.showMessageDialog(null,String.format("%s님의 성별 : %s",m.name,m.genderChecker(number)));
					break;
				}
			case "2"://계산기
				String cMenu = opt.showInputDialog(null,"1.계산기\n2.구구단");
				switch (cMenu) {
				case "1":	
					//계산기
					String[] calc = opt.showInputDialog(null, "계산기입니다 ex)5 + 6 ").split("");
					switch (calc[1]) {
					case "+":
						opt.showMessageDialog(null,String.format("결과: %s",c.plus(calc)));
						break;
					case "-":
						opt.showMessageDialog(null,String.format("결과: %s",c.minus(calc)));
						break;
					case "*":
						opt.showMessageDialog(null,String.format("결과: %s",c.multi(calc)));
						break;

					case "/":
						opt.showMessageDialog(null,String.format("결과: %s",c.divid(calc)));
						break;
					case "%":
						opt.showMessageDialog(null,String.format("결과: %s",c.percent(calc)));
						break;
					}
				case "2":
					//구구단
					String gugu =opt.showInputDialog(null, "구구단입니다.단수를 입력해주세요.");
					opt.showMessageDialog(null, String.format("%s", c.gugudan(gugu)));
					break;
				}
				break;
			case "3"://로또
				opt.showMessageDialog(null, String.format("%s",l.randomNum() ));
				break;
			case "4"://달력
				String year =opt.showInputDialog(null,"년도를 입력해주세요.");
				opt.showMessageDialog(null, String.format("%s", y.leapYear(year)));
				break;
			default:
				break;
			}
		}

	}
}
