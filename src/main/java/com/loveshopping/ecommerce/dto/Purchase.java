package com.loveshopping.ecommerce.dto;


import com.loveshopping.ecommerce.entity.Address;
import com.loveshopping.ecommerce.entity.Customer;
import com.loveshopping.ecommerce.entity.Order;
import com.loveshopping.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
