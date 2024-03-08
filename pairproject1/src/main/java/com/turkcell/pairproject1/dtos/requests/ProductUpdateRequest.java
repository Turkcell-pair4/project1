package com.turkcell.pairproject1.dtos.requests;

public record ProductUpdateRequest(String name,
                                   double unitPrice,
                                   int stock,
                                   String description,
                                   String photoUrl) {
}
