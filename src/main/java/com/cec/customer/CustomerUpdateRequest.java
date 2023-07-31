package com.cec.customer;

public record CustomerUpdateRequest (
        String name,
        String email,
        Integer age
) {
}
