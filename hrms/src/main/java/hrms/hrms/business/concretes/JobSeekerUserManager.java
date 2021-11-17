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
	public void add(JobSeekerUser jobSeeker) {
		if(jobSeeker.getEmail() == null) {
			System.out.println("E-posta boş bırakılamaz!");
			return;
		}else if(jobSeeker.getPassword() == null) {
			System.out.println("Şifre boş bırakılamaz!");
			return;
		}else if(jobSeeker.getPassword() != jobSeeker.getRePassword()) {
			System.out.println("Girdiğiniz şifreler aynı değil!");
			return;
		}else if(jobSeeker.getDate() == null) {
			System.out.println("Doğum tarihi boş bırakılamaz!");
			return;
		}else if(jobSeeker.getNationaltyId() == null) {
			System.out.println("Kimlik numarası boş bırakılamaz!");
			return;
		}else if(jobSeeker.getFirstName() == null) {
			System.out.println("Adınız boş bırakılamaz!");
			return;
		}else if(jobSeeker.getLastName() == null) {
			System.out.println("Soyadınız boş bırakılamaz!");
			return;
		}else {
			this.jobSeekerUserDao.save(jobSeeker);
		}
		
	}

	@Override
	public List<JobSeekerUser> getAll() {
		return this.jobSeekerUserDao.findAll();
	}

}
