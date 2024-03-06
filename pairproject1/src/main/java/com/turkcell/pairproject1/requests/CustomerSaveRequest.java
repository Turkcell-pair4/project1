package com.turkcell.pairproject1.requests;

public record CustomerSaveRequest(
        String name,
        String surname,
        String email,
        String address,
        String phone,
        String password,
        String gender) {
}
