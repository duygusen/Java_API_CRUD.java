package com.tobeto.a.spring.services.dtos.review.request;

import lombok.Data;

@Data
public class UpdateReviewRequest {
    private String id;
    private String userId;
    private String eventId;
    private String review;
    private int rating;
    private String reviewDate;
}
