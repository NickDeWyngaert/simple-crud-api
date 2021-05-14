package simplecrudapi.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simplecrudapi.model.dto.MovieDTO;
import simplecrudapi.model.entity.Movie;
import simplecrudapi.service.MovieService;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/movies")
public class MoviesApiController {

    private final MovieService service;

    @Autowired
    public MoviesApiController(MovieService service){
        this.service = service;
        this.createDummys();
    }

    // CREATE
    @PostMapping
    @ResponseBody
    public Movie createMovie(@RequestBody MovieDTO movie){
        return this.service.create(movie);
    }

    // READ
    @GetMapping
    @ResponseBody
    public List<Movie> getAllMovies(){
        return this.service.readAll();
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Movie getMovie(@PathVariable Long id){
        return this.service.read(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    @PatchMapping("/{id}")
    @ResponseBody
    public Movie updateMovie(@PathVariable Long id, @RequestBody MovieDTO movie){
        return this.service.update(id,movie);
    }

    // DELETE
    @DeleteMapping("/{id}")
    @ResponseBody
    public Movie deleteMovie(@PathVariable Long id){
        return this.service.delete(id);
    }

    private void createDummys(){
        MovieDTO movie1 = new MovieDTO();
            movie1.setTitle("Fast & Furious 8");
            movie1.setGenre("action");
            movie1.setDirector("F. Gary Gray");
            movie1.setRelease("2017-04-12");
            movie1.setDuration(145);
            movie1.setAbout("Now that Dominic Toretto (Vin Diesel) and Letty Ortiz (Michelle Rodriguez) are on their honeymoon, and Brian (Paul Walker) and Mia (Jordana Brewster) have retired from the game");
        MovieDTO movie2 = new MovieDTO();
            movie2.setTitle("The Martian");
            movie2.setGenre("science fiction");
            movie2.setDirector("Ridley Scott");
            movie2.setRelease("2015-09-11");
            movie2.setDuration(141);
            movie2.setAbout("During a manned mission to Mars, Astronaut Mark Watney is presumed dead after a fierce storm and left behind by his crew.");
        this.service.create(movie1);
        this.service.create(movie2);
    }

}
