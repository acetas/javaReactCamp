package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerUserService {
	List<JobSeekerUser> getAll();
}
