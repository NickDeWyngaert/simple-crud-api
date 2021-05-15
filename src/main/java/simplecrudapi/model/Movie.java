package simplecrudapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String genre;
    private String director;
    private String release;
    private int duration;
    private String imagelink;
    @Lob // long text
    private String about;

    public Movie() {}

    public Movie(String title, String genre, String director, String release, int duration, String imagelink, String about){
        this.setTitle(title);
        this.setGenre(genre);
        this.setDirector(director);
        this.setRelease(release);
        this.setDuration(duration);
        this.setImagelink(imagelink);
        this.setAbout(about);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public String getImagelink() {
        return imagelink;
    }
    public void setImagelink(String imageLink) {
        this.imagelink = imageLink;
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
        Movie movie = (Movie) o;
        return duration == movie.duration && Objects.equals(id, movie.id) && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre) && Objects.equals(director, movie.director) && Objects.equals(release, movie.release) && Objects.equals(imagelink, movie.imagelink) && Objects.equals(about, movie.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, director, release, duration, imagelink, about);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", release='" + release + '\'' +
                ", duration=" + duration +
                ", imagelink='" + imagelink + '\'' +
                ", about='" + about + '\'' +
                '}';
    }

}
