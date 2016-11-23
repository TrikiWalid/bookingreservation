package com.informatec.reservationbookingel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.informatec.reservationbookingel.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
