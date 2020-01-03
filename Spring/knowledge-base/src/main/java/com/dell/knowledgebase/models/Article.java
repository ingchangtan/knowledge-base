package com.dell.knowledgebase.models;

public class Article() {
    public int article_id;
    public String title;
    public String knowledge_base;
    public String state;
    public String product;
    public String created_date;
    public int modified_by;
    public String modified_date;
    public String published_date;
    public int rating;
    public String content;
    public int user_id;


    public Article( int article_id,  String title,  String knowledge_base,  String state,
             String product,  String created_date,  int modified_by,  String modified_date,
             String published_date,  int rating,  String content,  int user_id) {
        this.article_id = article_id;
        this.title = title;
        this.knowledge_base = knowledge_base;
        this.state = state;
        this.product = product;
        this.created_date = created_date;
        this.modified_by = modified_by;
        this.modified_date = modified_date;
        this.published_date = published_date;
        this.rating = rating;
        this.content = content;
        this.user_id = user_id;

    }

}