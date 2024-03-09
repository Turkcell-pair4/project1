package com.turkcell.pairproject1.dtos.requests.BasketItemRequests;

import com.turkcell.pairproject1.entities.Basket;
import com.turkcell.pairproject1.entities.Product;

public record BasketItemUpdateRequest (int id,
                                       Basket basket,
                                       Product product,
                                       int amount){

}
