package com.cfa.repository;

import com.cfa.model.QuadroA3Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadroA3Repository extends JpaRepository<QuadroA3Info, Long> {
    // Se necess�rio, adicione m�todos personalizados para acessar o banco de dados
    // Por exemplo, m�todos de busca espec�ficos
}
