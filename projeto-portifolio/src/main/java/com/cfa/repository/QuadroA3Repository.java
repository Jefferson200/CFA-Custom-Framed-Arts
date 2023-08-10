package com.cfa.repository;

import com.cfa.model.QuadroA3Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadroA3Repository extends JpaRepository<QuadroA3Info, Long> {
    // Se necessário, adicione métodos personalizados para acessar o banco de dados
    // Por exemplo, métodos de busca específicos
}
