package simplecrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplecrudapi.model.dto.MovieDTO;
import simplecrudapi.model.entity.Movie;
import simplecrudapi.repo.MovieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainMovieService implements MovieService {

    private final MovieRepository database;

    @Autowired
    public MainMovieService(MovieRepository database){
        this.database = database;
    }

    @Override
    public List<Movie> readAll() {
        return new ArrayList<Movie>();
    }

    @Override
    public Movie read(Long id) {
        return new Movie();
    }

    @Override
    public Movie create(MovieDTO movie) {
        return new Movie();
    }

    @Override
    public Movie update(Long id, MovieDTO movie) {
        return new Movie();
    }

    @Override
    public Movie delete(Long id) {
        return new Movie();
    }
}
