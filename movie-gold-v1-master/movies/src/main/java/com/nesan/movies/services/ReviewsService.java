package com.nesan.movies.services;

import com.nesan.movies.Dao.ReviewDao;
import com.nesan.movies.model.Movie;
import com.nesan.movies.model.Reviews;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {
    @Autowired
    private ReviewDao reviewDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Reviews addReview(String reviewBody, String imdbId){
        Reviews reviews=reviewDao.insert(new Reviews(reviewBody));

        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push("reviewIds").value(reviews)).first();
        return reviews;


    }
}
