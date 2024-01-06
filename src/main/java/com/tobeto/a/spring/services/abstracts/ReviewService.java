package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.review.request.AddReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.DeleteReviewRequest;
import com.tobeto.a.spring.services.dtos.review.request.UpdateReviewRequest;
import com.tobeto.a.spring.services.dtos.review.response.GetAllReviewsResponse;

import java.util.List;

public interface ReviewService {
    void add(AddReviewRequest request);
    void delete(DeleteReviewRequest request);
    void update(UpdateReviewRequest request);

    List<GetAllReviewsResponse> getAll();
}
