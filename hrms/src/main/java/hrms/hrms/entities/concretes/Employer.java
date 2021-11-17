package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "employer_id")
public class Employer extends User {
	
	@Id
	@GeneratedValue
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web-site")
	private String webSite;
	
	@Column(name = "phone")
	private String phoneNumber;
	
}
