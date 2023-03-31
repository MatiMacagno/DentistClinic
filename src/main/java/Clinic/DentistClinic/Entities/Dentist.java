package Clinic.DentistClinic.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dentist {

    @Column(name = "dentist_id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String tuition;

    @JsonIgnore
    @OneToMany(mappedBy = "dentist",fetch = FetchType.LAZY)
    private Set<Appointment> appointments= new HashSet<>();

}
