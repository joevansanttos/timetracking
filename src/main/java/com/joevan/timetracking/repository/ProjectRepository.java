package com.joevan.timetracking.repository;

import com.joevan.timetracking.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
