package com.loveshopping.ecommerce.service;

import com.loveshopping.ecommerce.dto.PaymentInfo;
import com.loveshopping.ecommerce.dto.Purchase;
import com.loveshopping.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
