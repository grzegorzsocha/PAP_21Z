package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Receptionist extends Employee{
}
