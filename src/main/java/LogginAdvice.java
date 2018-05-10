import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LogginAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation arg0) throws Throwable {
		//메소드를 멈추게 해준다.

		StopWatch watch = new StopWatch();
		String methodName = arg0.getMethod().getName();
		watch.start();
		System.out.println("Log method"+methodName+"시작됨");
		
		Object obj = arg0.proceed(); //메소드 코드가 실행 됨.
		watch.stop();
		System.out.println("Log method"+methodName+"종료");
		System.out.println("Log method처리시간 "+watch.getTotalTimeSeconds()+"처리됨");
		return obj;
	}
}
