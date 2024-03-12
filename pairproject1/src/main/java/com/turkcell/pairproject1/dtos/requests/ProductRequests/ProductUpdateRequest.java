package com.turkcell.pairproject1.dtos.requests.ProductRequests;

import com.turkcell.pairproject1.entities.Category;
import com.turkcell.pairproject1.entities.Seller;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

public record ProductUpdateRequest(@NotNull int id,
                                   @NotNull String name,
                                   @NotNull double unitPrice,
                                   @NotNull @Min(0) int stock,
                                   @NotNull double averageRating,
                                   @NotBlank @Length(max = 500, min = 3) String description,
                                   @URL String photoUrl,
                                   @NotNull Category category,
                                   @NotNull Seller seller) {
}
