package UsingAnnotationInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		PaymentProcessor processor = context.getBean(PaymentProcessor.class);
		processor.processDefaultPayment("100");
	} 
	

}
