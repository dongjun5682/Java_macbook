package bank;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보 보기")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료 되었습니다.");
						return;
					case "1":
						member = memberService.join(
								JOptionPane.showInputDialog("이름을 입력하세요."),
								JOptionPane.showInputDialog("주민번호를 입력하세요"),
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세요.")
								);
						JOptionPane.showMessageDialog(null,"회원가입되었습니다.");
						break;
					case "2":
//						memberService.login(
//								JOptionPane.showInputDialog("아이디를 입력하세요."),
//								JOptionPane.showInputDialog("비밀번호를 입력하세요.")
//								);
						JOptionPane.showMessageDialog(null,member.toString());
						break;
			}
		}
	}
}
