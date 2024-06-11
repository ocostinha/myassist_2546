package com.fiap.myassist_2546.resources.service;

import com.fiap.myassist_2546.commom.exceptions.NotFoundException;
import com.fiap.myassist_2546.core.domain.Os;
import com.fiap.myassist_2546.core.service.OsService;
import com.fiap.myassist_2546.resources.repository.entity.OsEntity;
import com.fiap.myassist_2546.resources.repository.OsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OsServiceImpl implements OsService {
    @Autowired
    private OsRepository osRepository;
    
    @Override
    public Os cadastrar(final Os os) {
        return new Os(osRepository.save(new OsEntity(os)));
    }

    @Override
    public Os consultar(final Long id) {
        return new Os(osRepository.findById(id).orElse(null));
    }

    @Override
    public List<Os> consultarTodos() {
        List<Os> retorno = new ArrayList<>();
        
        osRepository.findAll().forEach(osEntity -> {
            retorno.add(new Os(osEntity));
        });
        
        return retorno;
    }

    @Override
    public Os atualizar(final Long id, final Os os) {
        OsEntity entity = osRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Os não cadastrada"));

        entity.setProprietario(os.getProprietario());
        entity.setTipoEquipamento(os.getTipoEquipamento());
        entity.setEntradaLab(os.getEntradaLab());
        entity.setDefeito(os.getDefeito());
        entity.setPrevisaoEntrega(os.getPrevisaoEntrega());
        entity.setStatusConcerto(os.getStatusConcerto());
        entity.setObservacoes(os.getObservacoes());

        return new Os(osRepository.save(entity));
    }
}
