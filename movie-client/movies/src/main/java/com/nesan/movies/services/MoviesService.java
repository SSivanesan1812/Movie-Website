package com.nesan.movies.services;

import com.nesan.movies.Dao.MoviesDao;
import com.nesan.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    MoviesDao moviesdao;
    public List<Movie> allMovies(){
        return moviesdao.findAll();

    }

    public Optional<Movie> singleMovie(String id){
        return moviesdao.findMovieByImdbId(id);

    }
}
