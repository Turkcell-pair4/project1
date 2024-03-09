package com.turkcell.pairproject1.dtos.requests.SellerRequests;


public record SellerUpdateRequest (
        int id,
        String phoneNumber,
        String name,
        String email,
        String address
) {}
