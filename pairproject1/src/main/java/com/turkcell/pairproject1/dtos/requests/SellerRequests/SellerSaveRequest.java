package com.turkcell.pairproject1.dtos.requests.SellerRequests;


public record SellerSaveRequest(
        String phoneNumber,
        String name,
        String email,
        String address
) {}