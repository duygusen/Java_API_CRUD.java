package com.tobeto.a.spring.services.dtos.comment.requests;

import lombok.Data;

@Data
public class UpdateCommentRequest {
    private  String id;
    private String userId;
    private String eventId;
    private String comment;
    private String commentDate;
}
