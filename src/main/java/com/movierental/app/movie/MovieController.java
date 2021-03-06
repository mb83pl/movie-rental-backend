package com.movierental.app.movie;

import com.movierental.app.customer.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieFacade movieFacade;

    public MovieController(MovieFacade movieFacade) {
        this.movieFacade = movieFacade;
    }

    @GetMapping
    ResponseEntity<List<MovieDTO>> getMoviesList() {
        List<MovieDTO> movies = movieFacade.getMoviesList();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping("/{title}")
    ResponseEntity<MovieDTO> showMovieInfoByTitle(@PathVariable String title) {
        MovieDTO movieDTO = movieFacade.showMovieByTitle(title);
        return new ResponseEntity<>(movieDTO, HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<MovieDTO> saveMovie(@RequestBody MovieDTO movie) {
        MovieDTO movieDTO = movieFacade.saveNewMovie(movie);
        return new ResponseEntity<>(movieDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{title}/{year}")
    ResponseEntity<MovieDTO> updateMovie(@PathVariable String title, @PathVariable Long year, @RequestBody MovieDTO movie) {
        MovieDTO movieDTO = movieFacade.updateMovie(title, year, movie);
        return new ResponseEntity<>(movieDTO, HttpStatus.CREATED);
    }

    @DeleteMapping("/{title}/{year}")
    ResponseEntity<?> deleteMovie(@PathVariable String title, @PathVariable Long year) {
        movieFacade.deleteMovie(title, year);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
