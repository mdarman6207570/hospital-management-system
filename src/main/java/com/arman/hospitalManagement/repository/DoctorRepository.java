package com.arman.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arman.hospitalManagement.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}