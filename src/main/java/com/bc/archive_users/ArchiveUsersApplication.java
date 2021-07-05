package com.bc.archive_users;

import com.bc.archive_users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ArchiveUsersApplication {
	@Autowired
	private UsersService usersService;

	public static void main(String[] args) {
		SpringApplication.run(ArchiveUsersApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void testJpaMethods() {
		usersService.findAll().forEach(it-> System.out.println(it));
	}
}
