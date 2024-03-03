package com.turkcell.pairproject1.requests;

public record ReviewSaveRequest(int id,
                                String comment,
                                double rating) {
}
