package duantn.backend.controller.admin;

import duantn.backend.model.dto.input.ArticleInsertDTO;
import duantn.backend.model.dto.input.ArticleUpdateDTO;
import duantn.backend.model.dto.output.ArticleOutputDTO;
import duantn.backend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/")
public class ArtcleManage {
    final
    ArticleService service;

    public ArtcleManage(ArticleService service) {
        this.service = service;
    }

    @GetMapping("articles")
    public List<ArticleOutputDTO> listArticle(@RequestParam(required = false) Integer page,
                                              @RequestParam(required = false) Integer limit) {
        return service.listArticle(page, limit);
    }

    @DeleteMapping("articles/{id}")
    public ResponseEntity<String> bloclArticle(@PathVariable Integer id) {
        return service.deleteArticle(id);

    }

    @GetMapping("articles/active/{id}")
    public ResponseEntity<String> activeArticle(@PathVariable Integer id) {
        return service.activeArticle(id);
    }

    @PostMapping("articles")
    public ResponseEntity<?> insertArticle(@RequestBody ArticleInsertDTO articleInsertDTO) {
        return service.insertArticle(articleInsertDTO);
    }

    @PutMapping("articles")
    public ResponseEntity<?> updateArticle(@RequestBody ArticleUpdateDTO articleUpdateDTO) {
        return service.updateArticle(articleUpdateDTO);
    }

    @GetMapping("articles/{id}")
    public ResponseEntity<?> findbyID(@PathVariable Integer id) {
        return service.findOneArticle(id);
    }
}
