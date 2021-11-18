package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobSeekerUserService;
import hrms.hrms.dataAccess.abstracts.JobSeekerUserDao;
import hrms.hrms.entities.concretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService {

	JobSeekerUserDao jobSeekerUserDao;

	@Autowired
	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
	}

	@Override
	public List<JobSeekerUser> getAll() {
		return this.jobSeekerUserDao.findAll();
	}

}
