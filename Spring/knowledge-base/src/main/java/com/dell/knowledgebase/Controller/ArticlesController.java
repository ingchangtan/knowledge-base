package com.dell.knowledgebase.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dell.knowledgebase.entities.Article;
import com.dell.knowledgebase.entities.User;
import com.dell.knowledgebase.repositories.ArticleRepository;
import com.dell.knowledgebase.repositories.UserRepository;

@RestController
public class ArticlesController {

    @Autowired
    ArticleRepository articleRepo;

    @Autowired
    UserRepository userRepo;


    @PostMapping(value="/articles")
    public Article create(@RequestBody Article article) {

        User user = userRepo.findById(article.getUser_id()).orElse(null);
        if (user != null) {
            article.setUser(user);
        }
        
        articleRepo.save(article);
        return article;
    }


}
