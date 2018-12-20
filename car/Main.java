package car;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CarBean carBean = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.자동차등록 \n"
					+ "2.자동차 정보 보기 ")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						carBean = new CarBean();
						String carColor = JOptionPane.showInputDialog("자동차 색상을 입력하세요. ");
						carBean.setColor(carColor);
						String gearType = JOptionPane.showInputDialog("기어 갯수 입력하세요. ");
						carBean.setGearType(gearType);
						String door = JOptionPane.showInputDialog("자동차 문 갯수를 입력하세요. ");
						carBean.setDoor(Integer.parseInt(door));
						break;
					case "2":
						JOptionPane.showMessageDialog(null,carBean.toString());
						break;
			}
		}
	}
}