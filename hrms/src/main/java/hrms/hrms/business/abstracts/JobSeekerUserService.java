package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobSeekerUser;

public interface JobSeekerUserService {
	DataResult<List<JobSeekerUser>> getAll();
	Result add(JobSeekerUser jobSeekerUser);
}
