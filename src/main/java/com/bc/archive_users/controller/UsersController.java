package com.bc.archive_users.controller;

import com.bc.archive_users.dto.UsersDto;
import com.bc.archive_users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/findAll")
    public List<UsersDto> findAllUsers() {
        return usersService.findAll();
    }

    @PostMapping("/save")
    public UsersDto saveUsers(@RequestBody UsersDto usersDto) {
        return usersService.saveUser(usersDto);
    }

    @GetMapping("/findByLogin")
    public UsersDto findByLogin(@RequestParam String login) {
        return usersService.findByLogin(login);
    }

    @GetMapping("/findAllByName")
    public List<UsersDto> findAllByName(@RequestParam String name) {
        return usersService.findAllByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable Integer id) {
        usersService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
