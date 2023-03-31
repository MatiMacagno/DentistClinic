package Clinic.DentistClinic.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String street;
    @Column
    private Integer number;
    @Column
    private String locality;
    @Column
    private String province;

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Patient patient;


}
