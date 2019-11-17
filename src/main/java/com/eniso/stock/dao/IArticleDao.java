package com.eniso.stock.dao;

import com.eniso.stock.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleDao extends JpaRepository<Article,Long> {
}
