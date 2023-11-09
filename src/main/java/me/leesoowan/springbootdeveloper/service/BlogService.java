package me.leesoowan.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leesoowan.springbootdeveloper.domain.Article;
import me.leesoowan.springbootdeveloper.dto.AddArticleRequest;
import me.leesoowan.springbootdeveloper.dto.UpdateArticleRequest;
import me.leesoowan.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //빈으로 등록
@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request, String userName) {
        return blogRepository.save(request.toEntity(userName));
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article updateArticle(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found:" + id));

        article.update(request.getTitle(), request.getContent());
        return article;
    }
}
