package com.geekster.BackendInstagram.service;

import com.geekster.BackendInstagram.repository.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    IAdminRepo adminRepo;
}
