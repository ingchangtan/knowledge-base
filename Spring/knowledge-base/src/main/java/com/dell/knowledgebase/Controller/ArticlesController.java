package com.dell.knowledgebase.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.dell.knowledgebase.models.Article;

@RestController
public class ArticlesController {
    @PostMapping(path="/articles")
    public Article createArticle(@RequestBody Article article){
        return article;
    }
}