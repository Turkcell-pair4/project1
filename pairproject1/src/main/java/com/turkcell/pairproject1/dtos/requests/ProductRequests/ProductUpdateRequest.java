package com.turkcell.pairproject1.dtos.requests.ProductRequests;

import com.turkcell.pairproject1.entities.Category;
import com.turkcell.pairproject1.entities.Seller;

public record ProductUpdateRequest(int id,
                                   String name,
                                   double unitPrice,
                                   int stock,
                                   double averageRating,
                                   String description,
                                   String photoUrl,
                                   Category category,
                                   Seller seller) {
}
