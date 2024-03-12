package com.turkcell.pairproject1.dtos.requests.ReviewRequests;

import com.turkcell.pairproject1.entities.Customer;
import com.turkcell.pairproject1.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

public record ReviewUpdateRequest(
        @NotBlank @Length(min = 3, max = 500) String comment,
        @NotNull double rating,
        @NotNull Product product,
        @NotNull Customer customer) {
}
