package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data @NoArgsConstructor
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_gen")
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seq", allocationSize = 1)
    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String pesel;
    private char gender;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private String mailAddress;

    public String getFullName()
    {
        return this.name + " " + this.surname;
    }
}
