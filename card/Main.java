package card;


import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean cardBean = null; 
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.카드선택 \n"
					+ "2.카드 보여주기")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						//카드 종류
						//카드의 번호
						cardBean = new CardBean();
						String cardKind = JOptionPane.showInputDialog("카드 종류를 입하력세요.");
						cardBean.setKind(cardKind);
						String cardNumber = JOptionPane.showInputDialog("카드 번호를 입력하세요.");
						cardBean.setNumber(Integer.parseInt(cardNumber));
						break;
					case "2":
						//제출한 카드의 스펙
						JOptionPane.showMessageDialog(null,cardBean.toString());
						break;
			}
		}
	}
}
