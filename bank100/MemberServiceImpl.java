package bank100;

public class MemberServiceImpl implements MemberService{
	MemberBean member = new MemberBean();
	@Override
	public MemberBean join(String name,String ssn,String id,String pass) {

		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		return member;
		
	}

	@Override
	public String login(String id, String pass) {
		String res = "";
		if(member.getId().equals(id) && member.getPass().equals(pass)) {
			res = member.toString();
		}else {
			res = "아이디랑 비밀번호가 틀렸습니다.";
		}
		return res;
	}

	@Override
	public MemberBean update(String pass) {
		member.setPass(pass);
		return member;
	}

	@Override
	public void delet() {
	
	}


}
