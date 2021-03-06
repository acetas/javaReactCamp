package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "it_employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "it_employee_id")
public class Employee extends User {
	
	@Column(name = "name")
	private String firstName;
	
	@Column(name = "surname")
	private String lastName;
	
}
