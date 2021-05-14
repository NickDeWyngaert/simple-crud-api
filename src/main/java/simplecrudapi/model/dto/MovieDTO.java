package simplecrudapi.model.dto;

import java.util.Objects;

public class MovieDTO {

    private String title;
    private String genre;
    private String director;
    private String release;
    private int duration;
    private String about;

    public MovieDTO() {}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getRelease() {
        return release;
    }
    public void setRelease(String release) {
        this.release = release;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return duration == movieDTO.duration && Objects.equals(title, movieDTO.title) && Objects.equals(genre, movieDTO.genre) && Objects.equals(director, movieDTO.director) && Objects.equals(release, movieDTO.release) && Objects.equals(about, movieDTO.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, director, release, duration, about);
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", release='" + release + '\'' +
                ", duration=" + duration +
                ", about='" + about + '\'' +
                '}';
    }
}
