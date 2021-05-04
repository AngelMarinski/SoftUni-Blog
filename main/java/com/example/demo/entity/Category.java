package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "categories" )
public class Category {
    private Integer id;

    private String name;

    private Set<Article> article;

    public Category(){  }

    public Category(String name){
        this.name=name;
        this.article = new HashSet<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "category")
    public Set<Article> getArticles() {
        return article;
    }

    public void setArticles(Set<Article> article) {
        this.article = article;
    }
}
