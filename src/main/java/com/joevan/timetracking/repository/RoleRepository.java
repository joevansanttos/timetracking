package com.joevan.timetracking.repository;

import java.util.Optional;

import com.joevan.timetracking.models.ERole;
import com.joevan.timetracking.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
