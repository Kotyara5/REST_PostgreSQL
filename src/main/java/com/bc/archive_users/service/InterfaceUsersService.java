package com.bc.archive_users.service;

import com.bc.archive_users.dto.UsersDto;

import java.util.List;

public interface InterfaceUsersService {

    UsersDto saveUser(UsersDto usersDto);

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();

    List<UsersDto> findAllByName(String name);
}
