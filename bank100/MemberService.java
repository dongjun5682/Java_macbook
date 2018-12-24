package bank100;

public interface MemberService {
	//회원가입
	public MemberBean join(String name,String ssn,String id,String pass);
	//로그인
	public String login(String id , String pass);
	//정보 수정
	public MemberBean update(String pass);
	//회원탈퇴
	public void delet();
}
