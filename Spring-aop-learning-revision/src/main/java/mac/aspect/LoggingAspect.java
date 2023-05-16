package mac.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("1st advice given ");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("2nd advice given");
	}
	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		
	}
	@Before("allCircleMethods()")
	public void beforeCircleMethod() {
		System.out.println("Running advice for all circle methods..");
	}
	
	@Before("allModelClass()")
	public void allModelClasses() {
		System.out.println("Running advice for all model methods..");
	}
	
	//@Pointcut("execution(* mac.model.Circle.*(..))")
	@Pointcut("within(mac.model.Circle)")
	public void allCircleMethods() {
		
	}
	
	@Pointcut("within(mac.model..*)")
	public void allModelClass() {
		
	}
}
