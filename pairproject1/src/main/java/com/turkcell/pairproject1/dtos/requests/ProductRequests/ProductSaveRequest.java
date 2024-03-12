package com.turkcell.pairproject1.dtos.requests;

import com.turkcell.pairproject1.entities.Category;

public record ProductSaveRequest(@NotNull String name,
                                 @NotNull double unitPrice,
                                 @NotNull int stock,
                                 @NotNull String description,
                                 @URL String photoUrl,
                                 @NotNull Category category,
                                 @NotNull Seller seller) {
}
