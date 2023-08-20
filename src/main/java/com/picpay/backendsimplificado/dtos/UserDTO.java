package com.picpay.backendsimplificado.dtos;

import com.picpay.backendsimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance,
                      String email, String password, UserType userType) {
}
