package com.arman.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arman.hospitalManagement.entity.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}