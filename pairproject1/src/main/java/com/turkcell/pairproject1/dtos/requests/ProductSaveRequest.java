package com.turkcell.pairproject1.dtos.requests;

import com.turkcell.pairproject1.entities.Category;

public record ProductSaveRequest(String name,
                                 double unitPrice,
                                 int stock,
                                 String description,
                                 String photoUrl,
                                 Category category) {
}
