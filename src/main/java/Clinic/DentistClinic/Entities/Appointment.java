package Clinic.DentistClinic.Entities;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
@Data
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentist dentist;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column
    private LocalDate dateAppointment;

}
