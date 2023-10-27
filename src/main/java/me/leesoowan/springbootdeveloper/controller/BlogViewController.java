package me.leesoowan.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.leesoowan.springbootdeveloper.dto.ArticleListViewResponse;
import me.leesoowan.springbootdeveloper.repository.BlogRepository;
import me.leesoowan.springbootdeveloper.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BlogViewController {

    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll()
                .stream()
                .map(ArticleListViewResponse::new)
                .toList();

        model.addAttribute("articles", articles); //블로그 글 리스트 저장

        return "articleList"; //articleList.html
        // 라는 뷰 조회
    }
}
