package com.dell.knowledgebase.repositories;


import com.dell.knowledgebase.entities.Article;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Transactional
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}