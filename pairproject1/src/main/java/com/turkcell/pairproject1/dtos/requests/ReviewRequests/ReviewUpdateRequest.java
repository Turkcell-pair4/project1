package com.turkcell.pairproject1.dtos.requests.ReviewRequests;

import com.turkcell.pairproject1.entities.Customer;
import com.turkcell.pairproject1.entities.Product;

public record ReviewUpdateRequest(String comment,
                                  double rating,
                                  Product product,
                                  Customer customer) {
}
