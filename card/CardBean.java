package card;


public class CardBean {
	private String kind;
	private int number;
	
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	
	@Override
	public String toString() {
		return String.format("제출한카드]\n"
				+ "카드종류: %s\n"
				+ "카드번호: %s",kind,number);
	}
}