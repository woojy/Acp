import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("aop.xml");
		MessageBean bean = (MessageBean)ctx.getBean("messageBean");
		bean.sayHello();
	}

}
