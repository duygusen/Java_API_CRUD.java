package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.comment.requests.AddCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.DeleteCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.UpdateCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.response.GetAllCommentsResponse;

import java.util.List;

public interface CommentService {
    void add(AddCommentRequest request);
    void update(UpdateCommentRequest request);
    void delete(DeleteCommentRequest request);

    List<GetAllCommentsResponse> getAll();
}
