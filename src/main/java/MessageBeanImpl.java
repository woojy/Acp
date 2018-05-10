
public class MessageBeanImpl implements MessageBean{
	private String name;

	
	public void setName(String name) {
		this.name=name;
	}
	
	//관심사:메소드의 성능을 측정해보는 부분을공통의 관심사형으로추출
	//sayHello()의 성능을 측정해보자.
	//시작시간을 확인하고 실제 로직이 끝나는 시간을 확인하면 해당 차이값을 통해 메소드의 성능을 측정해볼수 있도록 해보자.
	@Override
	public void sayHello() {
		
		//시간 측정 시작(조인포인트)
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("안녕하세요."+name+"님");
		//시간 측정 끝(조인포인트)
		//로그 처리(조인포인트)
	}
}
