package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Comment;
import com.tobeto.a.spring.repositories.CommentRepository;
import com.tobeto.a.spring.services.abstracts.CommentService;
import com.tobeto.a.spring.services.dtos.comment.requests.AddCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.DeleteCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.UpdateCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.response.GetAllCommentsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentManager implements CommentService {

    private final CommentRepository commentRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddCommentRequest request) {

        Comment comment = this.modelMapperService.forRequest().map(request, Comment.class);
        commentRepository.save(comment);
    }

    @Override
    public void update(UpdateCommentRequest request) {

        Comment comment = modelMapperService.forRequest().map(request, Comment.class);
        commentRepository.save(comment);
    }

    @Override
    public void delete(DeleteCommentRequest request) {

        Comment comment = this.modelMapperService.forRequest().map(request, Comment.class);
        commentRepository.delete(comment);
    }

    @Override
    public List<GetAllCommentsResponse> getAll() {
        List<Comment> comments = commentRepository.findAll();
        return comments.stream()
                .map(comment -> this.modelMapperService.forResponse().map(comment, GetAllCommentsResponse.class))
                .toList();
    }
}
