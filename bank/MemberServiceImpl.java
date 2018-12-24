package bank;

public class MemberServiceImpl implements MemberService{

	@Override
	public MemberBean join(String name,String ssn,String id,String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		return member;
		
	}

	@Override
	public void login(String id, String pass) {
		
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delet() {
		// TODO Auto-generated method stub
		
	}


}
