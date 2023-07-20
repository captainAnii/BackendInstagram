package com.geekster.BackendInstagram.repository;

import com.geekster.BackendInstagram.model.AuthenticationToken;
import com.geekster.BackendInstagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}