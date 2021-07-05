package com.bc.archive_users.repository;

import com.bc.archive_users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByLogin(String login);

    List<Users> findAllByName(String name);
}
