package com.turkcell.pairproject1.dtos.requests;

public record ReviewSaveRequest(int id,
                                String comment,
                                double rating) {
}
