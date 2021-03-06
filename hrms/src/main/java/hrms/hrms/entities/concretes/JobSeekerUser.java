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
@Table(name = "job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "job_seeker_id")
public class JobSeekerUser extends User {
	
	@Column(name = "name")
	private String firstName;
	
	@Column(name = "surname")
	private String lastName;
	
	@Column(name = "nationalty_id")
	private String nationaltyId;
	
	@Column(name = "year")
	private int year;
}
