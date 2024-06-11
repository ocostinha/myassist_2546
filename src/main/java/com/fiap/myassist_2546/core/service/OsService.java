package com.fiap.myassist_2546.core.service;

import com.fiap.myassist_2546.core.domain.Os;

import java.util.List;

public interface OsService {
    Os cadastrar(Os os);
    Os consultar(Long id);
    List<Os> consultarTodos();
    Os atualizar(Long id, Os os);
}
