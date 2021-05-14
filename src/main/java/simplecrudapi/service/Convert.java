package simplecrudapi.service;

import simplecrudapi.model.dto.MovieDTO;
import simplecrudapi.model.entity.Movie;

public abstract class Convert {

    public static Movie dtoToMovie(MovieDTO dto){
        Movie movie = new Movie();
        movie.setTitle(dto.getTitle());
        movie.setGenre(dto.getGenre());
        movie.setDirector(dto.getDirector());
        movie.setRelease(dto.getRelease());
        movie.setDuration(dto.getDuration());
        movie.setAbout(dto.getAbout());
        return movie;
    }

}
