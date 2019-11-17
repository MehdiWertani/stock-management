package com.eniso.stock.controllers;

import com.eniso.stock.entities.Article;
import com.eniso.stock.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    IArticleService iArticleService ;
@Autowired
    public ArticleController(@Qualifier("ArticleServiceImpl") IArticleService iArticleService) {
        this.iArticleService = iArticleService;
    }

    @PostMapping("/save")
    public Article save(Article article) {
        return iArticleService.save(article);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Article article) {
        iArticleService.delete(article);
    }

    @PutMapping("/update")
    public Article update(@RequestBody  Article article) {
        return iArticleService.save(article);
    }

    @GetMapping("/getOne/{id}")
    public Article getOne(@PathVariable Long id) {
        return iArticleService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<Article> getAll() {
        return iArticleService.getAll();
    }
}
