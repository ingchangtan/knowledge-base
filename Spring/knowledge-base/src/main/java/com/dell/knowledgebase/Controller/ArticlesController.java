package com.dell.knowledgebase.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dell.knowledgebase.entities.Article;
import com.dell.knowledgebase.repositories.ArticleRepository;

@RestController
public class ArticlesController {

    @Autowired
    ArticleRepository articleRepo;


    @PostMapping(value="/articles")
    public Article create(
        @RequestBody Article article,
        @RequestParam(required=false) String article_id,
        @RequestParam(required=false) String title,
        @RequestParam(required=false) String knowlwdge_base,
        @RequestParam(required=false) String product,
        @RequestParam(required=false) String content
    ) {
        

        articleRepo.save(article);
        return article;
    }


}
