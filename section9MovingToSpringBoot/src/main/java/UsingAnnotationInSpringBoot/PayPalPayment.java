package UsingAnnotationInSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PaypalPayment")
@Primary
public class PayPalPayment implements PaymentService{

	@Override
	public void processPayment(String amount) {
		System.out.println("Processing paypal  payment of amount: " + amount);
		
	}

}
