package simplecrudapi.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simplecrudapi.model.entity.Movie;
import simplecrudapi.service.MovieService;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/movies")
public class MoviesApiController {

    private final MovieService service;

    @Autowired
    public MoviesApiController(MovieService service){
        this.service = service;
    }

    // CREATE
    @PostMapping
    @ResponseBody
    public Movie createMovie(){
        // TODO
        return new Movie();
    }

    // READ
    @GetMapping
    @ResponseBody
    public List<Movie> getAllMovies(){
        // TODO
        return new ArrayList<Movie>();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Movie getMovie(@PathVariable Long id){
        // TODO
        return new Movie();
    }

    // UPDATE
    @PutMapping("/{id}")
    @PatchMapping("/{id}")
    @ResponseBody
    public Movie updateMovie(@PathVariable Long id){
        // TODO
        return new Movie();
    }

    // DELETE
    @DeleteMapping("/{id}")
    @ResponseBody
    public Movie deleteMovie(@PathVariable Long id){
        // TODO
        return new Movie();
    }

}
