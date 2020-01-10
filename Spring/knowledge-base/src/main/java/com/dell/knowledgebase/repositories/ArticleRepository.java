package com.dell.knowledgebase.repositories;
import com.dell.knowledgebase.entities.Article;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



// public interface ArticleRepository extends JpaRepository<Article, Long> {
//     public List<Article> findAllByTitle(String title);
   
//     @Query("SELECT v FROM knowledge_base v WHERE v.title = :title")
//     public List<Article> searchAllByTitle(@Param("title") String title); 
// }
@Transactional
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
    public List<Article> findByTitleStartingWith(String title);

    public List<Article> findByTitleEndsWith(String title);    

    public List<Article> findByTitleContains(String title);

    public List<Article> findByTitleStartingWithAndTitleEndsWithAndTitleContains(String starts, String ends, String match);

}


    