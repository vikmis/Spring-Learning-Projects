package UsingAnnotationInSpringBoot;

import org.springframework.stereotype.Component;

@Component("CreditCardPaymnet")
public class CreditCardPayment implements PaymentService {
	
	@Override
	public void processPayment(String amount){
		System.out.println("Processing credit card payment of amount: " + amount);
	}

}
