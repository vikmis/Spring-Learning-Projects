package UsingAnnotationInSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PaymentProcessor {
	
	private final PaymentService  PaymentService;
	
	private  PaymentService creditCardPaymentService ;
	
	@Autowired
	public PaymentProcessor(PaymentService PaymentService) {
		this.PaymentService = PaymentService;
	
	}
	
	public void processDefaultPayment(String amount) {
		PaymentService.processPayment(amount);
	}
	
	public void processCreditCardPayment(String amount) {
		PaymentService.processPayment(amount);
	}

}
