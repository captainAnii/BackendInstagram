package com.geekster.BackendInstagram.repository;

import com.geekster.BackendInstagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
}
