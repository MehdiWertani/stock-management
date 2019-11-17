package com.eniso.stock.service;

import com.eniso.stock.entities.Article;

import java.util.List;

public interface IArticleService {
    Article save(Article article);

    void delete(Article article);

    Article update(Article article);

    Article getOne(Long id);

    List<Article> getAll();
}
