package simplecrudapi.miscellaneous;

import simplecrudapi.model.Movie;
import java.util.ArrayList;
import java.util.List;

public abstract class CreateDummyMovies {

    public static List<Movie> getDummyMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(
                "Fast & Furious 8",
                "action",
                "F. Gary Gray",
                "2017-04-12",
                145,
                "https://m.media-amazon.com/images/M/MV5BMjMxODI2NDM5Nl5BMl5BanBnXkFtZTgwNjgzOTk1MTI@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Now that Dominic Toretto (Vin Diesel) and Letty Ortiz (Michelle Rodriguez) are on their honeymoon, and Brian (Paul Walker) and Mia (Jordana Brewster) have retired from the game, and the rest of the crew has been exonerated, the globetrotting team has found a semblance of a normal life. But when a mysterious woman seduces Dom into the world of crime he can't seem to escape, and a betrayal of those closest to him, they will face trials that will test them as never before. From the shores of Cuba and the streets of New York City to the icy plains off the arctic Barents Sea, the elite force will crisscross the globe to stop an anarchist from unleashing chaos on the world's stage, and to bring home the man who made them a family."
        ));
        movies.add(new Movie(
                "I, Robot",
                "science fiction",
                "Alex Proyas",
                "2004-08-04",
                115,
                "https://m.media-amazon.com/images/M/MV5BNmE1OWI2ZGItMDUyOS00MmU5LWE0MzUtYTQ0YzA1YTE5MGYxXkEyXkFqcGdeQXVyMDM5ODIyNw@@._V1_UY268_CR8,0,182,268_AL_.jpg",
                "In 2035, techno-phobic homicide detective Del Spooner of the Chicago PD heads the investigation of the apparent suicide of leading robotics scientist, Dr. Alfred Lanning. Unconvinced of the motive, Spooner's investigation into Lanning's death reveals a trail of secrets and agendas within the USR (United States Robotics) corporation and suspicions of murder. Little does he know that his investigation would lead to uncovering a larger threat to humanity."
        ));
        movies.add(new Movie(
                "Avengers: Endgame",
                "action",
                "Anthony Russo, Joe Russo",
                "2019-04-2019",
                180,
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos's actions and undo the chaos to the universe, no matter what consequences may be in store, and no matter who they face..."
        ));
        movies.add(new Movie(
                "Avatar",
                "sience fiction",
                "James Cameron",
                "2009-12-16",
                162,
                "https://m.media-amazon.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora. There he learns of greedy corporate figurehead Parker Selfridge's intentions of driving off the native humanoid \"Na'vi\" in order to mine for the precious material scattered throughout their rich woodland. In exchange for the spinal surgery that will fix his legs, Jake gathers knowledge, of the Indigenous Race and their Culture, for the cooperating military unit spearheaded by gung-ho Colonel Quaritch, while simultaneously attempting to infiltrate the Na'vi people with the use of an \"avatar\" identity. While Jake begins to bond with the native tribe and quickly falls in love with the beautiful alien Neytiri, the restless Colonel moves forward with his ruthless extermination tactics, forcing the soldier to take a stand - and fight back in an epic battle for the fate of Pandora."
        ));
        movies.add(new Movie(
                "American Pie",
                "comedy",
                "Paul Weitz, Chris Weitz",
                "1999-11-10",
                95,
                "https://m.media-amazon.com/images/M/MV5BMTg3ODY5ODI1NF5BMl5BanBnXkFtZTgwMTkxNTYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Jim, Oz, Finch and Kevin are four friends who make a pact that before they graduate they will all lose their virginity. The hard job now is how to reach that goal by prom night. Whilst Oz begins singing to grab attention and Kevin tries to persuade his girlfriend, Finch tries any easy route of spreading rumors and Jim fails miserably. Whether it is being caught on top of a pie or on the Internet, Jim always ends up with his trusty sex advice from his father. Will they achieve their goal of getting laid by prom night? Or will they learn something much different?"
        ));
        return movies;
    }

}
