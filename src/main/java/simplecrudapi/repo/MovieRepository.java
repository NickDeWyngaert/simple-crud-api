package simplecrudapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import simplecrudapi.model.Movie;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional<Movie> findMovieById(Long id);
}
