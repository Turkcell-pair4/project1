package com.turkcell.pairproject1.dtos.requests.BasketRequests;

import com.turkcell.pairproject1.entities.Customer;

public record BasketUpdateRequest (int id ,
                                   int quantity,
                                   double totalPrice,
                                   Customer customer) {

}
