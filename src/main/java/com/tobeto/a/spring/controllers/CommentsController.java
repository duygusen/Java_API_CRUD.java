package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.CommentService;
import com.tobeto.a.spring.services.dtos.comment.requests.AddCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.DeleteCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.requests.UpdateCommentRequest;
import com.tobeto.a.spring.services.dtos.comment.response.GetAllCommentsResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comments")
public class CommentsController {

    private final CommentService commentService;

    public CommentsController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddCommentRequest request){
        commentService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateCommentRequest request){
        commentService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteCommentRequest request){
        commentService.delete(request);
    }

    @GetMapping
    public List<GetAllCommentsResponse> getAll(){return commentService.getAll();}
}
