package tv;


import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		TVBean tvBean = null;
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.TV정보 입력 \n"
					+ "2.TV정보 보기\n"
					+ "3.TV켜기\n"
					+ "4.채널 변경 ")) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
					case "1":
						//brand,color,price 입력
						//TV브랜드
						//TV색상
						// 가격
						tvBean = new TVBean();
						String brand = JOptionPane.showInputDialog("브랜드를 입력하세요.");
						tvBean.setBrand(brand);
						String color = JOptionPane.showInputDialog("컬러를 입력하세요.");
						tvBean.setColor(color);
						String price = JOptionPane.showInputDialog("가격을 입력하세요.");
						tvBean.setPrice(Integer.parseInt(price));
						tvBean.setPower(false);
						tvBean.setChannel(0);	
						break;
					case "2":
						//구입한 TV 스펙
						JOptionPane.showMessageDialog(null,tvBean.toString());
						break;
					case "3":
						tvBean.setPower(true);
						JOptionPane.showMessageDialog(null, "TV가 켜졌습니다. ");
						break;
					case "4":
						String changeChannel= JOptionPane.showInputDialog("채널 변경");
						tvBean.setChannel(Integer.parseInt(changeChannel));
						JOptionPane.showMessageDialog(null,String.format("채널 : %s", tvBean.getChannel()));
						break;
			}
		}
	}
}