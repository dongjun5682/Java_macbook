package bank;

public interface MemberService {
	//회원가입
	public MemberBean join(String name,String ssn,String id,String pass);
	//로그인
	public void login(String id , String pass);
	//정보 수정
	public void update();
	//회원탈퇴
	public void delet();
}
