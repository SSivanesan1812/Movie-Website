package com.nesan.movies.Dao;

import com.nesan.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MoviesDao extends MongoRepository<Movie, ObjectId> {
    public Optional<Movie> findMovieByImdbId(String id);
}
