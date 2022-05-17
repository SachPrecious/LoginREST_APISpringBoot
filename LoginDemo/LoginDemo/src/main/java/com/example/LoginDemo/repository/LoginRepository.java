package com.example.LoginDemo.repository;

import com.example.LoginDemo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<AppUser,Long> {

}
