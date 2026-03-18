package com.arman.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appoint_seq_gen")
	@SequenceGenerator(
	    name = "appoint_seq_gen",
	    sequenceName = "APPOINT_SEQ",
	    allocationSize = 1
	)
	private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "patient_id", nullable = false) // patient is required and not nullable
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private Doctor doctor;
}
