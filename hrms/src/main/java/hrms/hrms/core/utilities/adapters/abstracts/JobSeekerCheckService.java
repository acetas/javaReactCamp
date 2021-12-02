package hrms.hrms.core.utilities.adapters.abstracts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerCheckService {
	Result checkIfRealPerson(JobSeekerUser jobSeekerUser) throws Exception;
}
