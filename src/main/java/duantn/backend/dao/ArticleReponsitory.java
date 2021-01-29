package duantn.backend.dao;

import duantn.backend.model.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleReponsitory extends JpaRepository<Article, Integer> {
    Page<Article> findByDeletedFalse(Pageable pageable);

    List<Article> findByDeletedFalse();

    Article findByArticleIdAndDeletedFalse(Integer articleId);
}
