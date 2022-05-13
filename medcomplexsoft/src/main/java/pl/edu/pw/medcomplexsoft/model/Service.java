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
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "service_gen")
    @SequenceGenerator(name = "service_gen", sequenceName = "service_seq", allocationSize = 1)
    private long id;
    private String name;
    private double price;
    @OneToMany(mappedBy = "service")
    private List<ServicePosition> servicePositions;
}
