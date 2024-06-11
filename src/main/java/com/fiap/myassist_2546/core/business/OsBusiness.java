package com.fiap.myassist_2546.core.business;

import com.fiap.myassist_2546.core.domain.Os;

import java.util.List;

public interface OsBusiness {
    Os cadastrar(Os os);
    Os consultar(Long id);
    List<Os> consultarTodos();
    Os atualizar(Long id, Os os);
}
