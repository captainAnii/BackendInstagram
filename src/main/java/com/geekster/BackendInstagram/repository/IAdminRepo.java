package com.geekster.BackendInstagram.repository;

import com.geekster.BackendInstagram.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
