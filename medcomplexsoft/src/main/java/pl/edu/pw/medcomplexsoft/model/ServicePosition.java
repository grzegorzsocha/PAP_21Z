package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ServicePosition
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceposition_gen")
    @SequenceGenerator(name = "serviceposition_gen", sequenceName = "serviceposition_seq", allocationSize = 1)
    private long id;
    private int amount;
    @ManyToOne
    private Appointment appointment;
    @ManyToOne
    private Service service;
}