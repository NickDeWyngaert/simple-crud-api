package simplecrudapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import simplecrudapi.model.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
