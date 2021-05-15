package simplecrudapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simplecrudapi.exception.MovieNotFoundException;
import simplecrudapi.miscellaneous.CreateDummy;
import simplecrudapi.model.Error;
import simplecrudapi.model.Movie;
import simplecrudapi.service.MovieService;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MoviesController {

    private final MovieService service;

    @Autowired
    public MoviesController(MovieService service){
        this.service = service;
        // Create dummy's
        for(Movie movie : CreateDummy.movies()){
            if(movie != null) this.service.create(movie);
        }
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        this.logRequest(HttpMethod.POST,"Create movie","",movie.toString());
        Movie createdMovie = this.service.create(movie);
        return new ResponseEntity<>(createdMovie,HttpStatus.CREATED);
    }

    // READ
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        this.logRequest(HttpMethod.GET,"All movies");
        List<Movie> movies = this.service.readAll();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id){
        this.logRequest(HttpMethod.GET,"One movie",id.toString(),"");
        Movie movie;
        try {
            movie = this.service.read(id);
        }
        catch (MovieNotFoundException exception){
            return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        this.logRequest(HttpMethod.PUT,"Update movie",id.toString(),movie.toString());
        Movie updatedMovie = this.service.update(movie);
        return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id){
        this.logRequest(HttpMethod.DELETE,"Delete movie",id.toString(),"");
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Simple Log
    private void logRequest(HttpMethod httpMethod, String logic, String requestParameters, String requestBody){
        String log = "";
        log += httpMethod.toString();
        log += " - ";
        log += logic;
        log += " - ";
        if(!requestParameters.trim().isEmpty()) {
            log += requestParameters;
            log += " - ";
        }
        if(!requestBody.trim().isEmpty()) {
            log += requestBody;
        }
        System.out.println(log);
    }
    private void logRequest(HttpMethod httpMethod, String logic){ this.logRequest(httpMethod,logic,"",""); }

}
