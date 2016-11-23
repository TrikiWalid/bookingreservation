package com.informatec.reservationbookingel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.informatec.reservationbookingel.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
