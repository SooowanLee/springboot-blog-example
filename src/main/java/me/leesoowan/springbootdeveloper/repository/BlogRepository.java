package me.leesoowan.springbootdeveloper.repository;

import me.leesoowan.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
