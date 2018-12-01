package com.example.demo.repository;

import com.example.demo.entity.Article;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findByUser(User user);

}
