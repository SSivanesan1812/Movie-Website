package com.nesan.movies.controller;

import com.nesan.movies.model.Reviews;
import com.nesan.movies.services.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("root/review")
public class ReviewController {
    @Autowired
    ReviewsService reviewsService;

    @PostMapping
    public ResponseEntity<Reviews> addReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<>(reviewsService.addReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.OK);
    }
}
