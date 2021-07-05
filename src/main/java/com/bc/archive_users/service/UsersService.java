package com.bc.archive_users.service;

import com.bc.archive_users.dto.UsersDto;
import com.bc.archive_users.entity.Users;
import com.bc.archive_users.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService implements InterfaceUsersService {

    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;

    public UsersService(UsersRepository usersRepository, UsersConverter usersConverter) {
        this.usersRepository = usersRepository;
        this.usersConverter = usersConverter;
    }

    @Override
    public UsersDto saveUser(UsersDto usersDto) {
        //if (usersDto != null && !usersDto.getLogin().isEmpty()) {
            Users savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
            return usersConverter.fromUserToUserDto(savedUser);
        //}
        //return null;
    }

    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public UsersDto findByLogin(String login) {
        Users users = usersRepository.findByLogin(login);
        if (users != null) {
            return usersConverter.fromUserToUserDto(users);
        }
        return null;
    }

    @Override
    public List<UsersDto> findAll() {
        return converterListUsersToListUsersDto(usersRepository.findAll());
    }

    @Override
    public List<UsersDto> findAllByName(String name){
        return converterListUsersToListUsersDto(usersRepository.findAllByName(name));
    }

    private List<UsersDto> converterListUsersToListUsersDto(List<Users> users) {
        List<UsersDto> usersDto = new ArrayList<>();
        for (int i = 0; i < users.size(); ++i) {
            usersDto.add(usersConverter.fromUserToUserDto(users.get(i)));
        }
        return usersDto;
    }
}
