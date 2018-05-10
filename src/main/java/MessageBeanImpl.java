
public class MessageBeanImpl implements MessageBean{
	private String name;

	
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void sayHello() {
		
		//시간 측정 시간(조인포인트)
		System.out.println("안녕하세요."+name+"님");
		//로그처리(조인포인트)
	}
}
