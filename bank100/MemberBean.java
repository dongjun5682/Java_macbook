package bank100;

public class MemberBean {
	private String name,ssn,id,pass;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String toString() {
		return String.format("[회원정보]\n"
				+ "이름 : %s\n"
				+ "주민번호 : %s\n"
				+ "아이디 : %s\n"
				+ "비밀번호 : %s", name,ssn,id,pass);
	}
}
