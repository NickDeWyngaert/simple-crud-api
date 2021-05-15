package simplecrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplecrudapi.exception.MovieNotFoundException;
import simplecrudapi.model.Movie;
import simplecrudapi.repo.MovieRepository;
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
        return this.database.findAll();
    }

    @Override
    public Movie read(Long id) {
        return this.database.findMovieById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }

    @Override
    public Movie create(Movie movie) {
        return this.database.save(movie);
    }

    @Override
    public Movie update(Movie movie) {
        return this.database.save(movie);
    }

    @Override
    public void delete(Long id) {
        this.database.deleteById(id);
    }
}
