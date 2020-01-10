package com.dell.knowledgebase.repositories;

import com.dell.knowledgebase.entities.Article;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dell.knowledgebase.repositories.ArticleRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // public List<Article> findByTitleStartingWith(String title);
    // public List<Article> findByTitleEndsWith(String title);    
    // public List<Article> findByTitleContains(String title);
    // public List<Article> findByTitleStartingWithAndTitleEndsWithAndTitleContains(String starts, String ends, String match);
    // @Query("SELECT p FROM knowledge_base p WHERE p.title LIKE :title%")
    // public List<Article> searchByTitleStartingWith(@Param("title") String title);

    // @Query("SELECT p FROM knowledge_base p WHERE p.title LIKE %:title")
    // public List<Article> searchByTitleEndsWith(@Param("title")String title);    

    // @Query("SELECT p FROM knowledge_base p WHERE p.title LIKE %:title%")
    // public List<Article> searchByTitleContains(@Param("title")String title);

    // @Query("SELECT p FROM knowledge_base p WHERE p.title LIKE :starts% AND p.title LIKE %:ends AND p.title LIKE %:match%")
    // public List<Article> searchByTitleStartingWithAndTitleEndsWithAndTitleContains(@Param("starts")String starts, @Param("ends")String ends, @Param("match")String match);
}