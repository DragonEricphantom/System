package com.example.WebApi.P1.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GcJpaRepository extends JpaRepository<GcPo, Integer>, JpaSpecificationExecutor<GcPo> {
}
