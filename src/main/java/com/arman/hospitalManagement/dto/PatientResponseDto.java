package com.arman.hospitalManagement.dto;

import lombok.Data;

import java.time.LocalDate;

import com.arman.hospitalManagement.entity.type.BloodGroupType;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private BloodGroupType bloodGroup;
}
