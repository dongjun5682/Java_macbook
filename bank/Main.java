package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌개설\n"
					+ "4.계좌정보\n"
					+ "5.입금\n"
					+ "6.출금")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료되었습니다.");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("ID 입력");
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,"가입성공!!");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, member.info());
				break;
			case "3":
				account =new Account(0);
				JOptionPane.showMessageDialog(null,String.format("계좌가 개설되었습니다\n"
						+ "%s",account.today()));
				break;
			case "4":
				String info = account.info(member.name);
				JOptionPane.showMessageDialog(null,info);
				break;
			case "5":
				String deposit = JOptionPane.showInputDialog("입금할 금액을 입력하세요.");
				deposit = account.deposit(Integer.parseInt(deposit));
				JOptionPane.showMessageDialog(null, deposit);
				break;
			case "6":
				String withdrawal = JOptionPane.showInputDialog("출금할 금액을 입력해주세요.");
				withdrawal = account.withdrawal(Integer.parseInt(withdrawal));
				JOptionPane.showMessageDialog(null, withdrawal);
				break;
			}
		}
	}
}