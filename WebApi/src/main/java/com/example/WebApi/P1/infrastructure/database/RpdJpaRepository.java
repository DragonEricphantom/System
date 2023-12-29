package com.example.WebApi.P1.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RpdJpaRepository extends JpaRepository<RpdPo, Integer>, JpaSpecificationExecutor<RpdPo> {
}
