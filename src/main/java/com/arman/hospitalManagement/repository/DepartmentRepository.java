package com.arman.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arman.hospitalManagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}