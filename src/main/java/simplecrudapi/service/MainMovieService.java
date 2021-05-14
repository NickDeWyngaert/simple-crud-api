package simplecrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplecrudapi.model.dto.MovieDTO;
import simplecrudapi.model.entity.Movie;
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
        return this.database.findById(id).get();
    }

    @Override
    public Movie create(MovieDTO moviedto) {
        Movie movie = Convert.dtoToMovie(moviedto);
        movie = this.database.save(movie);
        return movie;
    }

    @Override
    public Movie update(Long id, MovieDTO moviedto) {
        this.delete(id);
        return this.create(moviedto);
    }

    @Override
    public Movie delete(Long id) {
        Movie movie = this.read(id);
        this.database.deleteById(id);
        return movie;
    }
}
