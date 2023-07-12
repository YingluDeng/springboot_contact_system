package com.cec.customer;

public record CustomerRegistrationRequest (
        String name,
        String email,
        Integer age
) {
}
