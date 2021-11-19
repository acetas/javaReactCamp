package hrms.hrms.core.utilities.adapters.abstracts;

import hrms.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerCheckService {
	boolean checkIfRealPerson(JobSeekerUser jobSeekerUser) throws Exception;
}
