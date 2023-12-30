package com.example.WebApi.P1.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CmcJpaRepository extends JpaRepository<CmcPo, Integer>, JpaSpecificationExecutor<CmcPo> {
}
