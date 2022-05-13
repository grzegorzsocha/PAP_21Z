package pl.edu.pw.medcomplexsoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Patient extends Person{
    @OneToMany(mappedBy = "receivingPatient")
    private List<Prescription> prescriptions;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
