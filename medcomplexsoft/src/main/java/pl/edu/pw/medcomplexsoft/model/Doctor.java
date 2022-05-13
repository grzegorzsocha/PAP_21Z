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
public class Doctor extends Employee {
    private String specialization;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "prescribingDoctor")
    private List<Prescription> prescriptions;
}
