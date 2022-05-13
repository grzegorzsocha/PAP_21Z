package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;
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
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescription_gen")
    @SequenceGenerator(name = "prescription_gen", sequenceName = "prescription_seq", allocationSize = 1)
    private long id;
    @ManyToOne
    private Doctor prescribingDoctor;
    @ManyToOne
    private Patient receivingPatient;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PrescriptionPosition> positions;
}
