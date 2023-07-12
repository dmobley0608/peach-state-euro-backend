package com.peachstateeruro.peachstateeuro.review;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/reviews")
public class ReviewController {
    private ReviewRepo repo;

    public ReviewController(ReviewRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public List<Review>  getAllReviews(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review){
        return repo.save(review);
    }
}
