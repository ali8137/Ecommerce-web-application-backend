package com.ali.ecommerce.paymentMethods.payPal;

import com.ali.ecommerce.DTO.CreateCheckoutSessionRequestDTO;
import com.ali.ecommerce.paymentMethods.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PayPalPayment implements PaymentStrategy {
    @Override
    public Map<String, String> pay(CreateCheckoutSessionRequestDTO request) {
        // implement the logic to pay with PayPal
        return Map.of();
    }
}
