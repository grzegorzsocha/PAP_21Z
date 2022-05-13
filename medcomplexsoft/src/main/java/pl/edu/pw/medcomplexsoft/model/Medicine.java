package pl.edu.pw.medcomplexsoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicine_gen")
    @SequenceGenerator(name = "medicine_gen", sequenceName = "medicine_seq", allocationSize = 1)
    private long id;
    private String name;
    private String manufacturer;
    @OneToMany(mappedBy = "medicine")
    private List<PrescriptionPosition> positions;
}
