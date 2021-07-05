package com.bc.archive_users.service;

import com.bc.archive_users.dto.UsersDto;
import com.bc.archive_users.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setLogin(usersDto.getLogin());
        users.setName(usersDto.getName());
        users.setBday(usersDto.getBday());
        users.setEmail(usersDto.getEmail());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        UsersDto usersDto = new UsersDto();
        usersDto.setId(users.getId());
        usersDto.setLogin(users.getLogin());
        usersDto.setName(users.getName());
        usersDto.setBday(users.getBday());
        usersDto.setEmail(users.getEmail());
        return usersDto;
    }
}