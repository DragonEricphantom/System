package com.example.WebApi.dao.repository;

import com.example.WebApi.dao.Entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
    @Override
    List<ArticleEntity> findAll();

    Optional<ArticleEntity> findTopByOrderByIDDesc();

    ArticleEntity findByID(Integer id);

    List<ArticleEntity> findByTITLEContainingIgnoreCase(String keyword);

//    ArticleEntity findByTITLE(String title);

    Optional<ArticleEntity> findByTITLE(String title);


}
