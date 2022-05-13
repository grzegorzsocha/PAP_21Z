package pl.edu.pw.medcomplexsoft.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data @NoArgsConstructor
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_gen")
    @SequenceGenerator(name = "address_gen", sequenceName = "address_seq", allocationSize = 1)
    private long id;
    private String street;
    private long houseNumber;
    private Long flatNumber;
    private String city;
    private String postalCode;
    private String country;
}
