package com.tobeto.a.spring.services.dtos.comment.response;

import lombok.Data;

@Data
public class GetAllCommentsResponse {
    private String userId;
    private String eventId;
    private String comment;
    private String commentDate;
}
