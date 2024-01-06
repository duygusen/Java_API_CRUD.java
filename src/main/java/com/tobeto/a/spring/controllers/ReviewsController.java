package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.ReviewService;
import com.tobeto.a.spring.services.dtos.review.request.AddReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.DeleteReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.UpdateReviewRequest;
import com.tobeto.a.spring.services.dtos.review.response.GetAllReviewsResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reviews")
public class ReviewsController {

    private final ReviewService reviewService;
    public ReviewsController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddReviewRequest request){
        reviewService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateReviewRequest request){
        reviewService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteReviewRequest request){
        reviewService.delete(request);
    }

    @GetMapping("/gelAll")
    public List<GetAllReviewsResponse> getAll(){return reviewService.getAll();}
}
