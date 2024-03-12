package com.turkcell.pairproject1.dtos.requests.SellerRequests;


import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record SellerUpdateRequest (
        @NotNull int id,
        @NotNull @Length(min = 11, max = 11) String phoneNumber,
        @NotBlank @Length(min = 3, max = 50) String name,
        @Email String email,
        @NotBlank @Length(min = 3, max = 100) String address
) {}
