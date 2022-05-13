package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor
public class Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_gen")
    @SequenceGenerator(name = "appointment_gen", sequenceName = "appointment_seq", allocationSize = 1)
    private long id;
    private LocalDateTime appointmentDate;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;
    private int duration;
    private String office;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL)
    private List<ServicePosition> servicesPositions;
}
