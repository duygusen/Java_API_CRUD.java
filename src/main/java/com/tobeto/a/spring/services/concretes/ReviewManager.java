package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Review;
import com.tobeto.a.spring.repositories.ReviewRepository;
import com.tobeto.a.spring.services.abstracts.ReviewService;
import com.tobeto.a.spring.services.dtos.calendar.response.GetAllCalendarsResponse;
import com.tobeto.a.spring.services.dtos.review.request.AddReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.DeleteReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.UpdateReviewRequest;
import com.tobeto.a.spring.services.dtos.review.response.GetAllReviewsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewManager implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddReviewRequest request) {
        Review review = this.modelMapperService.forRequest().map(request, Review.class);
        reviewRepository.save(review);
    }

    @Override
    public void delete(DeleteReviewRequest request) {
        Review review = this.modelMapperService.forRequest().map(request, Review.class);
        reviewRepository.save(review);
    }

    @Override
    public void update(UpdateReviewRequest request) {
        Review review = this.modelMapperService.forRequest().map(request, Review.class);
        reviewRepository.save(review);
    }

    @Override
    public List<GetAllReviewsResponse> getAll() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(review -> this.modelMapperService.forResponse().map(review, GetAllReviewsResponse.class))
                .toList();
    }
}
