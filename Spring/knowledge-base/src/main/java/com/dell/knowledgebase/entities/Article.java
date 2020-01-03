package com.dell.knowledgebase.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="knowledge__base")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int article_id;

    @Column
    private String title;
    @Column(name = "knowledge_base")
    private String knowledge_base;
    @Column
    private String state;
    @Column
    private String product;
    @Column
    private String created_date;
    @Column
    private int modified_by;
    @Column
    private String modified_date;
    @Column
    private String published_date;
    @Column
    private int rating;
    @Column
    private String content;


    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
   


    @Column(insertable = false, updatable = false)
    private Long user_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public int getArticle_id() {
        return this.article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKnowledge_base() {
        return this.knowledge_base;
    }

    public void setKnowledge_base(String knowledge_base) {
        this.knowledge_base = knowledge_base;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCreated_date() {
        return this.created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public int getModified_by() {
        return this.modified_by;
    }

    public void setModified_by(int modified_by) {
        this.modified_by = modified_by;
    }

    public String getModified_date() {
        return this.modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public String getPublished_date() {
        return this.published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }





    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}