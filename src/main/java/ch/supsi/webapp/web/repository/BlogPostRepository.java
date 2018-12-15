package ch.supsi.webapp.web.repository;

import ch.supsi.webapp.web.model.entity.BlogPost;
import ch.supsi.webapp.web.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    boolean existsById(long id);

    BlogPost findTop1ById(long id);

    BlogPost findFirstByOrderByIdDesc();

}