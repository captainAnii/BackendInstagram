package com.geekster.BackendInstagram.repository;

import com.geekster.BackendInstagram.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}
