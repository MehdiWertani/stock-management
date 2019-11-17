package com.eniso.stock.service.impl;

import com.eniso.stock.dao.IArticleDao;
import com.eniso.stock.entities.Article;
import com.eniso.stock.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ArticleServiceImpl")
public class ArticleServiceImpl implements IArticleService {
    IArticleDao iArticleDao;
     @Autowired
    public ArticleServiceImpl(IArticleDao iArticleDao) {
        this.iArticleDao = iArticleDao;
    }

    @Override
    public Article save(Article article) {
        return iArticleDao.save(article);
    }

    @Override
    public void delete(Article article) {
      iArticleDao.delete(article);
    }

    @Override
    public Article update(Article article) {
        return iArticleDao.save(article);
    }

    @Override
    public Article getOne(Long id) {
        return iArticleDao.getOne(id);
    }

    @Override
    public List<Article> getAll() {
        return iArticleDao.findAll();
    }
}
