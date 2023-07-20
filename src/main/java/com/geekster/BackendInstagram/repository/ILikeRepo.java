package com.geekster.BackendInstagram.repository;

import com.geekster.BackendInstagram.model.Like;
import com.geekster.BackendInstagram.model.Post;
import com.geekster.BackendInstagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}
