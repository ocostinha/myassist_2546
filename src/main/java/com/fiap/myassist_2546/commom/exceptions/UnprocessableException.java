package com.fiap.myassist_2546.commom.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UnprocessableException extends RuntimeException {
    private String mensagem;
}
