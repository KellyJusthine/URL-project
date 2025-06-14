package url_shortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import url_shortener.model.Url;

public interface UrlRepository extends JpaRepository<Url, String> {
}
