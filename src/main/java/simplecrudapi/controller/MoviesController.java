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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/movies")
public class MoviesController {

    private final static boolean REQUESTLOG = true;
    private final MovieService service;

    @Autowired
    public MoviesController(MovieService service){
        this.service = service;
        this.createDummys(); // remove this line if you don't want dummy's in your list
    }

    // CREATE
    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody Movie movie){
        this.logRequest(HttpMethod.POST,"Create movie","",movie.toString());
        Movie createdMovie;
        try {
            createdMovie = this.service.create(movie);
            return new ResponseEntity<>(createdMovie,HttpStatus.CREATED);
        }
        catch (RuntimeException exception) {
            return new ResponseEntity<>(new Error("Something went wrong on our side"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // READ
    @GetMapping
    public ResponseEntity<?> getAllMovies(){
        this.logRequest(HttpMethod.GET,"All movies");
        List<Movie> movies;
        try {
            movies = this.service.readAll();
            return new ResponseEntity<>(movies, HttpStatus.OK);
        }
        catch (RuntimeException exception) {
            return new ResponseEntity<>(new Error("Something went wrong on our side"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovie(@PathVariable Long id){
        this.logRequest(HttpMethod.GET,"One movie",id.toString(),"");
        Movie movie;
        try {
            movie = this.service.read(id);
            return new ResponseEntity<>(movie, HttpStatus.OK);
        }
        catch (MovieNotFoundException exception){
            return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.NOT_FOUND);
        }
        catch (RuntimeException exception) {
            return new ResponseEntity<>(new Error("Something went wrong on our side"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        this.logRequest(HttpMethod.PUT,"Update movie",id.toString(),movie.toString());
        Movie updatedMovie;
        try {
            updatedMovie = this.service.update(movie);
            return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
        }
        catch (MovieNotFoundException exception) {
            return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.NOT_FOUND);
        }
        catch (RuntimeException exception) {
            return new ResponseEntity<>(new Error("Something went wrong on our side"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id){
        this.logRequest(HttpMethod.DELETE,"Delete movie",id.toString(),"");
        try {
            this.service.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (MovieNotFoundException exception) {
            return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.NOT_FOUND);
        }
        catch (RuntimeException exception) {
            return new ResponseEntity<>(new Error("Something went wrong on our side"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Simple Log
    private void logRequest(HttpMethod httpMethod, String logic, String requestParameters, String requestBody){
        if(REQUESTLOG) {
            String log = "";
            log += LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString();
            log += " - ";
            log += httpMethod.toString();
            log += " - ";
            log += logic;
            if(!requestParameters.trim().isEmpty()) {
                log += " - ";
                log += requestParameters;
                log += " - ";
            }
            if(!requestBody.trim().isEmpty()) {
                log += requestBody;
            }
            System.out.println(log);
        }
    }
    private void logRequest(HttpMethod httpMethod, String logic){ this.logRequest(httpMethod,logic,"",""); }

    // Dummy's
    private void createDummys(){
        for(Movie movie : CreateDummy.movies()) if(movie != null) this.service.create(movie);
    }

}
