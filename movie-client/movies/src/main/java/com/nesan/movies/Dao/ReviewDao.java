package com.nesan.movies.Dao;

import com.nesan.movies.model.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewDao extends MongoRepository<Reviews, ObjectId> {

}
