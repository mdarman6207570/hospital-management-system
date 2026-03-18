package com.arman.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arman.hospitalManagement.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}