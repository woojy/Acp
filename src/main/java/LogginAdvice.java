import org.springframework.util.StopWatch;

public class LogginAdvice {
	public void test(String methodName) {
		StopWatch watch = new StopWatch();
		watch.start();
		System.out.println("Log method"+methodName+"시작됨");
		watch.stop();
		System.out.println("Log method"+methodName+"종료");
		System.out.println("Log method처리시간 "+watch.getTotalTimeSeconds()+"처리됨");
	}
}
