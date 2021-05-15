package simplecrudapi.service;

import simplecrudapi.model.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> readAll();
    Movie read(Long id);
    Movie create(Movie movie);
    Movie update(Movie movie);
    void delete(Long id);
}
