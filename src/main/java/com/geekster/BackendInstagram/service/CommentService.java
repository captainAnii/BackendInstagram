package com.geekster.BackendInstagram.service;

import com.geekster.BackendInstagram.model.Comment;
import com.geekster.BackendInstagram.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;
    public String addComment(Comment comment) {
        comment.setCommentCreationTimeStamp(LocalDateTime.now());
        commentRepo.save(comment);
        return "Comment has been added!!!";
    }

    public Comment findComment(Integer commentId) {
        return  commentRepo.findById(commentId).orElse(null);
    }

    public void removeComment(Comment comment) {
        commentRepo.delete(comment);
    }
}
