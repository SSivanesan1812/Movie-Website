package com.nesan.movies.controller;

import com.nesan.movies.model.Movie;
import com.nesan.movies.services.MoviesService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/root")
public class MovieController {
    @Autowired
    MoviesService moviesservice;
    @GetMapping
    public ResponseEntity<List<Movie>> allmovies(){
        return new ResponseEntity<List<Movie>>(moviesservice.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
        public ResponseEntity<Optional<Movie>> singleMovie(@PathVariable String id){
            return new ResponseEntity<>(moviesservice.singleMovie(id),HttpStatus.OK);
    }



    }


