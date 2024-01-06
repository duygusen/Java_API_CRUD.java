package com.tobeto.a.spring.services.dtos.comment.requests;

import lombok.Data;

@Data
public class AddCommentRequest {

    private String userId;
    private String eventId;
    private String comment;
    private String commentDate;


}
