package simplecrudapi.service;

import simplecrudapi.model.dto.MovieDTO;
import simplecrudapi.model.entity.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> readAll();
    Movie read(Long id);
    Movie create(MovieDTO movie);
    Movie update(Long id, MovieDTO movie);
    Movie delete(Long id);
}
