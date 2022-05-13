package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class PrescriptionPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescriptionpos_gen")
    @SequenceGenerator(name = "prescriptionpos_gen", sequenceName = "prescriptionpos_seq", allocationSize = 1)
    private long id;
    private String dosage;
    @ManyToOne
    private Prescription prescription;
    @ManyToOne
    private Medicine medicine;
}
