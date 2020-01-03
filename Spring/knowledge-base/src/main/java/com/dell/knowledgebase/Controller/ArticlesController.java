package com.dell.knowledgebase.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.dell.knowledgebase.entities.Article;
import com.dell.knowledgebase.repositories.ArticleRepository;

import java.util.List;

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

    @GetMapping(value = "/articles")
    public List<Article> index(
        @RequestParam(name="starts", required=false) String starts,
        @RequestParam(name="ends", required=false) String ends,
        @RequestParam(name="match", required=false) String match
    ) {
        if(starts != null && ends != null && match != null) {
            return articleRepo.findByTitleStartingWithAndTitleEndsWithAndTitleContains(starts, ends, match);
        } else if(starts != null){
            return articleRepo.findByTitleStartingWith(starts);
        } else if( ends != null){
            return articleRepo.findByTitleEndsWith(ends);
        } else if (match != null){
            return articleRepo.findByTitleContains(match);
        }
        return articleRepo.findAll();
    }
}
