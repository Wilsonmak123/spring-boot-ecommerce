package com.loveshopping.ecommerce.service;

import com.loveshopping.ecommerce.dto.Purchase;
import com.loveshopping.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
